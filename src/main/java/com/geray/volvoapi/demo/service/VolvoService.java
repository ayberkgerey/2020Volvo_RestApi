package com.geray.volvoapi.demo.service;

import com.geray.volvoapi.demo.model.Volvo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VolvoService {

    private List<Volvo> carList = Arrays.asList(
            new Volvo("s60","diesel","sedan",36050, (float) 4.9),
            new Volvo("s60Hybrid","gasoline","sedan",55400, (float) 4.9),
            new Volvo("s90","diesel","sedan",50550, (float) 4.9),
            new Volvo("s90Hybrid","gasoline","sedan",63200, (float) 4.9),
            new Volvo("v60","diesel","station",39650, (float) 4.9),
            new Volvo("v60CrossCountry","diesel","station",45100, (float) 4.9),
            new Volvo("v60Hybrid","gasoline","station",67300, (float) 4.9),
            new Volvo("v90","both","station",51450, (float) 4.9),
            new Volvo("v90CrossCountry","both","station",54550, (float) 4.9),
            new Volvo("xc40","both","suv",33700, (float) 4.9),
            new Volvo("xc60","both","suv",40150, (float) 4.9),
            new Volvo("xc60","both","suv",53950, (float) 4.9),
            new Volvo("xc90","both","suv",48350, (float) 4.9),
            new Volvo("xc90Hybrid","gasoline","suv",67000, (float) 4.9)
    );

        public List<Volvo> getAllCars(){
            return carList;
        }


    public Volvo getbySerie(String serie) {
        return carList.stream().filter(t -> t.getSerie().equals(serie)).findFirst().get();
        }


    public List<Volvo> getbyBodyType(String bodyType) {
           List<Volvo> searchedTypes = Arrays.asList();
        for (int i = 0; i < carList.size() ; i++) {
                if(carList.get(i).getBodyType().equals(bodyType)){
                    searchedTypes.add(carList.get(i));
                }
            }
            return searchedTypes;
        }


}
