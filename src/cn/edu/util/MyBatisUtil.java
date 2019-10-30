package cn.edu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory;

    static {
        try {
            //1、获取mybatis-work.xml文件的输入流  这里的resources使用的是ibatis里面的resources，不能弄错
            InputStream is = Resources.getResourceAsStream("mybatis-work.xml");
            //2、创建sqlsessionFactory对象，完成对配置文件的读取
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession createSqlSession(){
        //3、创建sqlsession   false表示事务关闭
        return factory.openSession(false);
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }
}
