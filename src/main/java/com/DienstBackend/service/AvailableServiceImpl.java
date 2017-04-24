package com.DienstBackend.service;

import com.DienstBackend.dao.AvailableDao;
import com.DienstBackend.domain.Available;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IKIKUCHI on 18-4-2017.
 */
@Service
public class AvailableServiceImpl {

    @Autowired
    private AvailableDao availableDao;

    public void save(Available available) {availableDao.save(available);}

}
