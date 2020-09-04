package com.panda;

import com.panda.dao.IUserDao;
import com.panda.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException {
        in= Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        sqlSession=factory.openSession();

        userDao=sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void destroy() throws IOException {
        //提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void findAll(){
        List<User> userList = userDao.findAll();
        for(User u: userList){
            System.out.println(u);
        }
    }

    @Test
    public void  insertuUser(){
        User u=new User();
        u.setId("15");
        u.setName("高");
        u.setBirth("2020-07-09");
        u.setSex("女");
        userDao.insertUser(u);
    }

    @Test
    public void updateUser(){
        User u=new User();
        u.setId("15");
        u.setName("G");
        u.setBirth("2020-07-09");
        u.setSex("女");
        userDao.updateUser(u);
    }
}
