package com.astontech.hr.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@org.springframework.stereotype.Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }


}
