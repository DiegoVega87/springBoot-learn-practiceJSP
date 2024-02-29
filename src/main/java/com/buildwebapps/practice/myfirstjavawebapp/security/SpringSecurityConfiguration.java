package com.buildwebapps.practice.myfirstjavawebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder()::encode)
                .username("diego")
                .password("dummy")
                .roles("USER", "ADMIN")
                .build();

        UserDetails userDetails2 = User.builder()
                .passwordEncoder(passwordEncoder()::encode)
                .username("user")
                .password("dummy")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails, userDetails2);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
