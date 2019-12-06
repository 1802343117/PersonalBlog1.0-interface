package com.blog.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.blog.dao.ArticleDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @classname:UserController
 * @description:文章控制层
 * @author:zhuoran
 * @Date: 2019/10/10 10:33
 */
public class ArticleDaoImpl implements ArticleDao {
    @Override
    public List<Entity> articleAll() throws SQLException {
        //查询
        return Db.use().query("select * from article ORDER BY id DESC ");
    }
}
