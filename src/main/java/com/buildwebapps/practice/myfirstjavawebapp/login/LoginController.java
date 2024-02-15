package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String gotToLoginPage(){
        return "login";
    }
}
