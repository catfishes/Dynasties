package jy.controller;

import jy.bo.impl.IBoLogin;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RequestMapping(value="/yard")
public class Login {

    private IBoLogin iBoLogin;

    public IBoLogin getiBoLogin() {
        return iBoLogin;
    }

    public void setiBoLogin(IBoLogin iBoLogin) {
        this.iBoLogin = iBoLogin;
    }

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public int login(@RequestParam Map param, HttpSession session){

        List  qxList = iBoLogin.login(param);
        int code = 0;

        if(qxList!=null && qxList.size()>0){
            code = 1;
            //登陆成功，放置session信息
            session.setAttribute("QXXX",qxList.get(0));
        }else{
            code = -1;
        }

        return code;
    }


}
