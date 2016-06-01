package com.astontech.hr.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Configuration
public class WebConfiguration {

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");

        return  registrationBean;
    }
    //region PROPERTIES


    //endregion PROPERTIES

    //region CONSTRUCTORS


    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS


    //endregion CUSTOM METHODS


}
