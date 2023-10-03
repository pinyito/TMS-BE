package com.tripandora.Tripandora.controller;

import com.tripandora.Tripandora.entity.FuelValue;
import com.tripandora.Tripandora.service.FuelValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/trans-route/v1")
public class FuelController {

    @Autowired
    private FuelValueService fuelValueService;

    @GetMapping("/fuel/values")
    public List<Integer> getAllFuelValues() {
        return fuelValueService.getFuelValues();
    }
}
