package com.example.authservice.auth;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final Log logger = LogFactory.getLog(getClass());
    
    private final String USERNAME = "trucnt";
    private final String PASSWORD = "password";

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug(username);
        if (username == null || !username.equals(USERNAME)) {
            logger.warn("User not found with username: " + username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(username, bcryptEncoder.encode(PASSWORD), new ArrayList<>());
    }

  

}
