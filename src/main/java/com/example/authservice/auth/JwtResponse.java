package com.example.authservice.auth;

import java.io.Serializable;

/**
 * JwtResponse used to create the response object send to the client.
 */
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private String jwtToken;

    public JwtResponse() {
    }

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return this.jwtToken;
    }
}
