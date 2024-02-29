package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name") // This is to tell Spring to keep the name in the session
public class WelcomeController {

    @RequestMapping(value="/",method = RequestMethod.GET ) // This is the method that will be called when the form is submitted
    public String gotToWelcomePage(ModelMap model){
        model.put("name", getLoggedinUsername()); // This is the data that will be passed to the welcome page
        return "welcome";
    }

    private String getLoggedinUsername() { // This is a helper method to get the logged in user
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

}
