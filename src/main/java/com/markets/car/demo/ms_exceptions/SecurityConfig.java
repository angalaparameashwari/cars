package com.markets.car.demo.ms_exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private CustomExceptionHandler exceptionHandler;

    @Autowired
    public SecurityConfig(CustomExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override
    public void configure(WebSecurity webSecurity) {
//        webSecurity.ignoring().antMatchers();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
                .cors().disable()
                .csrf().disable()
//                .authorizeRequests()
//                .anyRequest().authenticated().and()
//                .exceptionHandling().and()
                .addFilterBefore(new AuthenticationFilter(), BasicAuthenticationFilter.class)
                .addFilterBefore(new ExceptionHandlerFilter(exceptionHandler),AuthenticationFilter.class);

//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authorizeRequests()
//                .anyRequest().authenticated().and()
//                .exceptionHandling().and()
//                .addFilterBefore(new AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//                .addFilterBefore(new ExceptionHandlerFilter(exceptionHandler),AuthenticationFilter.class);
    }

}