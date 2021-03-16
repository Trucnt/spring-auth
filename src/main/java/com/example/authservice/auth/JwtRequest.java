package com.example.authservice.auth;

import java.io.Serializable;

/**
 * JwtRequest object used as a request object for getting username and password
 * from the client.
 */
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
