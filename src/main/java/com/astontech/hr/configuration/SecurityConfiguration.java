package com.astontech.hr.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{


    //region PROPERTIES


    //endregion PROPERTIES

    //region CONSTRUCTORS


    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //permit all with no authentication
        httpSecurity.authorizeRequests().antMatchers("/").permitAll()
                .and()
                .authorizeRequests().antMatchers("/console/**").permitAll();

        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();

    }


    //endregion CUSTOM METHODS


}
