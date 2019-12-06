package com.blog.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface ArticleDao {
    /**
     *
     * @return
     * @throws SQLException
     */
    List<Entity> articleAll() throws SQLException;
}
