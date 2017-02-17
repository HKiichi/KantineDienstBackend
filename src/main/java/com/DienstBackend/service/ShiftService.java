package com.DienstBackend.service;

import com.DienstBackend.domain.Shift;

/**
 * Created by ikikuchi on 11-1-2017.
 */
public interface ShiftService {
    Shift findByDate(String date);

    void save (Shift shift);

    Shift saveShift(Shift shift);

}
