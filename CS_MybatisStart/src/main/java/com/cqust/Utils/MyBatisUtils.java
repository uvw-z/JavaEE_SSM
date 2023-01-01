package com.cqust.Utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MyBatisUtils {
    public static SqlSession getSqlSession(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=factory.openSession();

            return session;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
