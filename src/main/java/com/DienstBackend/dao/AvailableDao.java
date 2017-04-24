package com.DienstBackend.dao;

import com.DienstBackend.domain.Available;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IKIKUCHI on 18-4-2017.
 */
public interface AvailableDao extends CrudRepository<Available, Long>{
  List<Available>findAll();

}
