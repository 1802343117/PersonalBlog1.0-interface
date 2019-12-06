package com.blog.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface MusicDao {
    /**
     *
     * @return
     * @throws SQLException
     */
    List<Entity> musicAll() throws SQLException;
}
