package com.DienstBackend.files.controllers;

import com.DienstBackend.files.domain.Shift;
import com.DienstBackend.files.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ikikuchi on 11-1-2017.
 */
@RestController
public class ShiftController {

    @Autowired
    ShiftService shiftService;

    @RequestMapping(value = "/shifts", method = RequestMethod.POST, produces = {"application/json"})
    public Shift shiftPost(@RequestBody Shift shift) {
        shiftService.saveShift(shift);
        System.out.println(shift.getDate());
        return shift;
    }
}
