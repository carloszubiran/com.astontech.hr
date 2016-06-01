package com.astontech.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Carlos Zubiran on 5/31/2016.
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminHome() {
        return "admin/adminHome";
    }

    @RequestMapping(value = "/admin/element", method = RequestMethod.GET)
    public String adminElement() {
        return "admin/element";
    }

}
