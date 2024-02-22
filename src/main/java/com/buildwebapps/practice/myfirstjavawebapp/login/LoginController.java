package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @RequestMapping("login")
    public String gotToLoginPage(){

        return "login";
    }
}
