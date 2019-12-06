package com.blog.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.blog.dao.UserDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @classname:UserController
 * @description:用户控制层
 * @author:zhuoran
 * @Date: 2019/10/10 10:33
 */
public class UserDaoImpl implements UserDao{
    @Override
    public List<Entity> findAll() throws SQLException {
        //查询
        return Db.use().query("select * from t_user ORDER BY id DESC ");
    }
}
