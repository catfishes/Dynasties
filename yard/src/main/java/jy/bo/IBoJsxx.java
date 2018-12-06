package jy.bo;

import jy.config.exception.DelException;
import jy.config.exception.SaveException;

import java.util.Map;

public interface IBoJsxx {

    public Map getJsxx(Map param);

    public int insertJsxx(Map param) throws SaveException;

    public  int updateJsxx(Map param) throws SaveException;

    public  int delJsxx(Map param) throws DelException;
}
