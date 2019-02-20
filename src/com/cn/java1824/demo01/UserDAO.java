package com.cn.java1824.demo01;

import org.apache.ibatis.annotations.Select;

public interface UserDAO {
    @Select("select * from Zh where id = #{id}")
    User queryUser(int id);
}
