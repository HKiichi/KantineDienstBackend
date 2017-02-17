package com.DienstBackend.dao;

import com.DienstBackend.domain.Shift;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by iris on 21-11-16.
 */
public interface ShiftDao extends CrudRepository<Shift, Long> {
        Shift findByDate(String date);
}
