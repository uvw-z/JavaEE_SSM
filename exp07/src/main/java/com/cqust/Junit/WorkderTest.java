package com.cqust.Junit;

import com.cqust.Dao.WorkerMapper;
import com.cqust.Pojo.Worker;
import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class WorkderTest {
    SqlSession session = MyBatisUtils.getSession();
    WorkerMapper mapper = session.getMapper(WorkerMapper.class);
    @Test
    public void findWorkerByIdTest() {
        Worker worker = mapper.selectWorker(1);
        System.out.println(worker);
    }

    @Test
    public void insertWorkerTest() {
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("赵六");
        worker.setAge(36);
        worker.setSex("女");
        worker.setWorker_id("1004");
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        int result = mapper.insertWorker(worker);
        if (result > 0) {
            System.out.println("成功插入" + result + "条数据");
        } else {
            System.out.println("插入数据失败");
        }
        System.out.println(worker.toString());
        session.commit();
        session.close();
    }

    @Test
    public void updateWorkerTest() {
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("李华");
        worker.setAge(28);
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        // 2.更新员工信息
        int result = mapper.updateWorker(worker);
        if (result > 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }
        System.out.println(worker.toString());
        session.commit();
        // 3.关闭SqlSession
        session.close();
    }

    @Test
    public void deleteWorkerTest() {
        int result = mapper.deleteWorker(4);
        if (result > 0) {
            System.out.println("成功删除" + result + "条数据");
        } else {
            System.out.println("删除数据失败");
        }
        session.commit();
        session.close();
    }

    @Test
    public void selectWorkerByIdAndNameTest() {
        Worker worker = mapper.selectWorkerByIdAndName(3, "王五");
        System.out.println(worker.toString());
        session.close();
    }
}
