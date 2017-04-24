package com.DienstBackend.dao;

import com.DienstBackend.domain.Shift;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by iris on 21-11-16.
 */
public interface ShiftDao extends CrudRepository<Shift, Long> {
        Shift findByDate(String date);
        List<Shift> findAll();

       // Shift findByShift(Shift shift);
}
