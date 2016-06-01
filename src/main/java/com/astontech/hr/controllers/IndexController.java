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

    //region PROPERTIES


    //endregion PROPERTIES

    //region CONSTRUCTORS


    //endregion CONSTRUCTORS

    //region GETTERS / SETTERS


    //endregion GETTERS / SETTERS

    //region CUSTOM METHODS


    //endregion CUSTOM METHODS


}
