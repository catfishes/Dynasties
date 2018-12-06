package jy.dao.impl;

import jy.config.exception.DaoException;
import jy.dao.DaoDbUtils;
import jy.dao.IDaoJsxx;

import java.sql.SQLException;
import java.util.Map;

public class DaoJsxxImpl implements IDaoJsxx {
    private DaoDbUtils daoDbUtils;

    @Override
    public Map getJsxx(Map param) throws DaoException {
        try {
            return (Map)this.daoDbUtils.select(param);
        } catch (SQLException e) {
            throw new DaoException(e.getMessage());
        }
    }

    @Override
    public int insertJsxx(Map param) throws DaoException{
        try {
            return (Integer) this.daoDbUtils.insert(param);
        } catch (SQLException e) {
            throw new DaoException(e.getMessage());
        }
    }

    @Override
    public int updateJsxx(Map param) throws DaoException{
        try {
            return (int)this.daoDbUtils.update(param);
        } catch (SQLException e) {
            throw new DaoException(e.getMessage());
        }
    }

    @Override
    public int delJsxx(Map param) throws DaoException{
        try {
            return (int)this.daoDbUtils.delete(param);
        } catch (SQLException e) {
            throw new DaoException(e.getMessage());
        }
    }

    public void setDaoDbUtils(DaoDbUtils daoDbUtils) {
        this.daoDbUtils = daoDbUtils;
    }
}
