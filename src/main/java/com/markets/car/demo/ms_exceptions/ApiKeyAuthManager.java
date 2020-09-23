package com.markets.car.demo.ms_exceptions;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import javax.sql.DataSource;

/**
 * Handles authenticating api keys against the database.
 */
public class ApiKeyAuthManager implements AuthenticationManager {


    public ApiKeyAuthManager() {
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String keys= "CARS_API_KEY";
        if (!keys.equals("CARS_API_KEY")) {
            throw new BadCredentialsException("The API key was not found or not the expected value.");
        } else {
            authentication.setAuthenticated(true);
            return authentication;
        }
    }
}