package com.cn.java1824.demo01;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDAO2 {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate sqlSessionTemplate;
    public  User queryUser(int id){
        UserDAO2 mapper=sqlSessionTemplate.getMapper(UserDAO2.class);
        return mapper.queryUser(id);
    }
}
