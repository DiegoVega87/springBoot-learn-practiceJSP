package com.buildwebapps.practice.myfirstjavawebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {

        UserDetails userDetails = createNewUser("diego", "dummy");
        UserDetails userDetail2 = createNewUser("user", "dummydummy");

        return new InMemoryUserDetailsManager(userDetails, userDetail2);
    }

    private UserDetails createNewUser(String username, String password) {
        UserDetails userDetails = User.builder()
                .passwordEncoder(passwordEncoder()::encode)
                .username(username)
                .password(password)
                .roles("USER", "ADMIN")
                .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // All sites are protected by default
    // A login form is shown for unauthenticated users
    // CSRF needs to be disabled for H2 Console
    // Frames need to be enabled for H2 Console

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception { // This is to create the security filter chain

        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated());
        http.formLogin(withDefaults()); // This is to enable the form login

        http.csrf(csrf -> csrf.disable()); // This is to disable CSRF
        http.headers(headers ->
                headers
                        .frameOptions(frameOptions -> frameOptions.disable())); // This is to enable H2 console

        return http.build(); // This is to build the security filter chain
    }

}
