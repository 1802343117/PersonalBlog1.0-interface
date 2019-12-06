package com.blog.factory;

import com.blog.dao.ArticleDao;
import com.blog.dao.GalleryDao;
import com.blog.dao.MusicDao;
import com.blog.dao.UserDao;
import com.blog.dao.impl.ArticleDaoImpl;
import com.blog.dao.impl.GalleryDaoImpl;
import com.blog.dao.impl.MusicDaoImpl;
import com.blog.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return (UserDao) new UserDaoImpl();
    }

    public static ArticleDao getArcticleDaoInstance(){
        return (ArticleDao) new ArticleDaoImpl();
    }

    public static GalleryDao getGalleryDaoInstance(){
        return (GalleryDao) new GalleryDaoImpl();
    }

    public static MusicDao getMusicDaoInstance(){
        return (MusicDao) new MusicDaoImpl();
    }
}
