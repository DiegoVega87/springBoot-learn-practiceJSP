package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass()); //This is a logger object to log messages to the console

    @RequestMapping("login")
    public String gotToLoginPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        logger.debug("Request param is {}", name); // Printed only at debug level
        logger.info("I want this printed at info level"); // Printed at info level and above
        logger.error("I want this printed at warn level"); // Printed at error level and above
        return "login";
    }
}
