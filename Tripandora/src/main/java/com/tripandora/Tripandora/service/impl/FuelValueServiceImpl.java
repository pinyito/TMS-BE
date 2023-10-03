package com.tripandora.Tripandora.service.impl;

import com.tripandora.Tripandora.entity.FuelValue;
import com.tripandora.Tripandora.repository.FuelValueRepository;
import com.tripandora.Tripandora.service.FuelValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuelValueServiceImpl implements FuelValueService {

    @Autowired
    private FuelValueRepository fuelValueRepository;

    @Override
    public List<Integer> getFuelValues() {
        List<Integer> filteredList = new ArrayList<>();
        List<FuelValue> fuelValueList = new ArrayList<>();

        fuelValueList = fuelValueRepository.findAll();

        if(!fuelValueList.isEmpty()){
            filteredList = fuelValueList.stream().map(FuelValue::getValue).collect(Collectors.toList());
        }
        return filteredList;
    }
}
