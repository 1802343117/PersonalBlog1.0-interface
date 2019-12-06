package com.blog.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    /**
     *
     * @return
     * @throws SQLException
     */
    List<Entity> findAll() throws SQLException;
}
