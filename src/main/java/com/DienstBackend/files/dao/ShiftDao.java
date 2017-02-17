package com.DienstBackend.files.dao;

import com.DienstBackend.files.domain.Shift;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by iris on 21-11-16.
 */
public interface ShiftDao extends CrudRepository<Shift, Long> {
        Shift findByDate(String date);
}
