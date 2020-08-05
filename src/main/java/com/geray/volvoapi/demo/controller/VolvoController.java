package com.geray.volvoapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolvoController {

    @GetMapping(value = "/")
    private String getCars(){
        return "MyCars";
    }

}
