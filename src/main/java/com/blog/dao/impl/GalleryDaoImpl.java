package com.blog.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.blog.dao.GalleryDao;

import java.sql.SQLException;
import java.util.List;

public class GalleryDaoImpl implements GalleryDao {
    @Override
    public List<Entity> gallertAll() throws SQLException {
        //查询
        return Db.use().query("select * from gallery ORDER BY id DESC ");
    }
}
