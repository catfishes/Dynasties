package jy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class LoginController {

    @RequestMapping(value="/welcome.do",method = RequestMethod.GET)
    public String welcome(@RequestParam Map param, HttpSession session){

        return "welcome!!!!";
    }

}
