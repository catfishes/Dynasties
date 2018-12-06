package jy.bo.impl;

import jy.bo.IBoJsxx;
import jy.config.exception.DaoException;
import jy.config.exception.DelException;
import jy.config.exception.SaveException;
import jy.dao.IDaoJsxx;

import java.util.Map;

public class BoJsxxImpl implements IBoJsxx {

    private IDaoJsxx daoJsxx;
    @Override
    public Map getJsxx(Map param) {
        try {
            return this.daoJsxx.getJsxx(param);
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return param;
    }

    @Override
    public int insertJsxx(Map param) throws SaveException{
        try {
            return this.daoJsxx.insertJsxx(param);
        } catch (DaoException e) {
            e.printStackTrace();
            throw new SaveException(e);
        }
    }

    @Override
    public int updateJsxx(Map param) throws SaveException{
        try {
            return this.daoJsxx.updateJsxx(param);
        } catch (DaoException e) {
            e.printStackTrace();
            throw new SaveException(e);
        }
    }

    @Override
    public int delJsxx(Map param) throws DelException{
        try {
            return this.daoJsxx.delJsxx(param);
        } catch (DaoException e) {
            e.printStackTrace();
            throw new DelException(e);
        }
    }

    public void setDaoJsxx(IDaoJsxx daoJsxx) {
        this.daoJsxx = daoJsxx;
    }
}
