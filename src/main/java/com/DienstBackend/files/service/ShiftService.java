package com.DienstBackend.files.service;

import com.DienstBackend.files.domain.Shift;

import java.util.Date;

/**
 * Created by ikikuchi on 11-1-2017.
 */
public interface ShiftService {
    Shift findByDate(String date);

    void save (Shift shift);

    Shift saveShift(Shift shift);

}
