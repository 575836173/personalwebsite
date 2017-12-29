package com.lengzq.controller;

import com.lengzq.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by lengzq on 2017/12/29.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/index")
    public String login_page(){return "page/index";}
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(String username,String password){
        return loginService.login(username,password);
    }
}
