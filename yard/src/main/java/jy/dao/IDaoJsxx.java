package jy.dao;

import jy.config.exception.DaoException;

import java.util.Map;

public interface IDaoJsxx {

    public Map getJsxx(Map param) throws DaoException;

    public int insertJsxx(Map param) throws DaoException;

    public  int updateJsxx(Map param) throws DaoException;

    public  int delJsxx(Map param) throws DaoException;

}
