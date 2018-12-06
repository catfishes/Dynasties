package jy.bo;

import jy.dao.DaoDbUtils;

public class BoDbUtils {

    private DaoDbUtils iDao;


    public DaoDbUtils getiDao() {
        return iDao;
    }

    public void setiDao(DaoDbUtils iDao) {
        this.iDao = iDao;
    }
}
