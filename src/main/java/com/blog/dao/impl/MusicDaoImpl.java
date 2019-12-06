package com.blog.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.blog.dao.MusicDao;

import java.sql.SQLException;
import java.util.List;

public class MusicDaoImpl implements MusicDao {
    @Override
    public List<Entity> musicAll() throws SQLException {
        //查询
        return Db.use().query("select * from music ORDER BY id DESC ");
    }
}
