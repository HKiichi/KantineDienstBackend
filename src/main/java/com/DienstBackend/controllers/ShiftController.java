package com.DienstBackend.controllers;

import com.DienstBackend.domain.Available;
import com.DienstBackend.domain.Shift;
import com.DienstBackend.service.AvailableService;
import com.DienstBackend.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ikikuchi on 11-1-2017.
 */
@RestController
public class ShiftController {

    @Autowired
    ShiftService shiftService;
    AvailableService availableService;
    private String date;

    @RequestMapping(value = "/shifts", method = RequestMethod.POST, produces = {"application/json"})
    public Shift shiftPost(@RequestBody Shift shift) {
        System.out.println(shift.toString());
        shiftService.save(shift);
        System.out.println(shift.getTime());
        return shift;
    }

    @RequestMapping(value = "shifts", method = RequestMethod.POST)
    public Available availablePut (@RequestBody Available available){
            availableService.save(available) ;
        System.out.println(available.isAvailable());
        return available;
    }

    @RequestMapping(value = "/shifts", method = RequestMethod.GET)
    public List<Shift> shiftGet(){

        return shiftService.findShiftList();
    }
    
}
