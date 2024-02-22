package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) { // Constructor injection
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login",method = RequestMethod.GET ) // This is the method that will be called when the form is submitted
    public String gotToLoginPage(){

        return "login";
    }

    @RequestMapping(value="login",method = RequestMethod.POST ) // This is the method that will be called when the form is submitted
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authenticationService.authenticate(name,password)){
            model.put("name", name); // This is the data that will be passed to the welcome page
            model.put("password", password);    // This is the data that will be passed to the welcome page
            return "welcome"; // This is the page that will be displayed after the form is submitted
        }else{
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }
}
