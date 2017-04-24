package com.DienstBackend.service;

import com.DienstBackend.domain.Shift;

import java.util.List;

/**
 * Created by ikikuchi on 11-1-2017.
 */
public interface ShiftService {
    Shift findByDate(String date);

    void save (Shift shift);
    List<Shift> findShiftList();


   // Shift saveShift(Shift shift);

  //  Shift findByShift(Shift shift);

}
