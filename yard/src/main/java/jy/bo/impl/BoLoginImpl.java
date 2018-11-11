package jy.bo.impl;

import jy.dao.impl.IDaoLogin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoLoginImpl implements jy.bo.impl.IBoLogin {

    //引入dao层对象
    private IDaoLogin iDaoLogin;
    public void setiDaoLogin(IDaoLogin iDaoLogin) {
        this.iDaoLogin = iDaoLogin;
    }

    @Override
    public List login(Map param) {

        List qxList = new ArrayList();
        qxList = iDaoLogin.login(param);

        return qxList;
    }


}
