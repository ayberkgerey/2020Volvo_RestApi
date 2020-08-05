package com.geray.volvoapi.demo.controller;

import com.geray.volvoapi.demo.model.Volvo;
import com.geray.volvoapi.demo.service.VolvoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/volvo/body/{bodyType}")
    public List<Volvo> getByBodyType(@PathVariable  String bodyType){
        return volvoService.getBybodyType(bodyType);
    }

    @DeleteMapping(value = "/volvo/{serie}")
    public void deleteCar(@PathVariable String serie){
        volvoService.deleteCar(serie);
    }

}
