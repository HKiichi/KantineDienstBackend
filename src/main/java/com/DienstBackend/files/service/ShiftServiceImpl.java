package com.DienstBackend.files.service;

import com.DienstBackend.files.dao.ShiftDao;
import com.DienstBackend.files.domain.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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

    @Override
    public Shift saveShift(Shift shift) {
        return shiftDao.save(shift);
    }
}

