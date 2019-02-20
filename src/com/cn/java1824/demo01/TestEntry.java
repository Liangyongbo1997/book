package com.cn.java1824.demo01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applitionContext.xml")
public class TestEntry {


    @Autowired
    @Qualifier("userDao")
    private UserDAO2 userDao;


    @Test
    public void test() {

        User user = userDao.queryUser(1);

        System.out.println(user);


//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(null);

//        SqlSession sqlSession = factory.openSession();


        // mybatis & Spring 整合时 SqlSessionFactoryBean

//        SqlSessionFactoryBean  = SqlSessionFactory

//        SqlSessionTemplate = SqlSession

    }


}
