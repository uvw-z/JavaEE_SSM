package com.cqust.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/3 13:34
 */
public class MyBatisUntils2 {
    private static SqlSessionFactory sqlSessionFactory = null;
    //初始化SQLSessionFactory对象
    static {
        try {
            //使用Mybatis提供的Resources类加载Mybatis的配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //构建SQLSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
