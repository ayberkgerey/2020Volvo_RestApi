package com.geray.volvoapi.demo.controller;

import com.geray.volvoapi.demo.model.Volvo;
import com.geray.volvoapi.demo.service.VolvoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class VolvoController {

    @Autowired
    private VolvoService volvoService;

    @RequestMapping("/volvo")
    public List<Volvo> getAllCars(){
        return volvoService.getAllCars();
    }

    @GetMapping(value = "/volvo/{serie}")
    public Volvo getVolvobySerie(@PathVariable String serie){
        return volvoService.getbySerie(serie);
    }


    @GetMapping(value = "/volvo/{bodyType}")
    public List<Volvo> getVolvoByBodyType(@PathVariable String bodyType){
        return volvoService.getbyBodyType(bodyType);
    }



}
