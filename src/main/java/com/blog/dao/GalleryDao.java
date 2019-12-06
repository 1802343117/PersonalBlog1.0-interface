package com.blog.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface GalleryDao {
    /**
     *
     * @return
     * @throws SQLException
     */
    List<Entity> gallertAll() throws SQLException;
}
