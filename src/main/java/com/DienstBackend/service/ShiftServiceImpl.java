package com.DienstBackend.service;

import com.DienstBackend.dao.ShiftDao;
import com.DienstBackend.domain.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ikikuchi on 11-1-2017.
 */
@Service
public class ShiftServiceImpl implements ShiftService{


    @Autowired
    private ShiftDao shiftDao;

    @Override
    public Shift findByDate(String date) {
        return shiftDao.findByDate(date);
    }

    @Override
    public void save(Shift shift) {
    shiftDao.save(shift);
    }


    public List<Shift> findShiftList(){
        return shiftDao.findAll();
    }

   // @Override
   // public Shift saveShift(Shift shift) {
   //     return shiftDao.save(shift);
   // }

   // @Override
   // public Shift findByShift(Shift shift)//{
       // return shiftDao.findByShift(shift);
   // }
}

