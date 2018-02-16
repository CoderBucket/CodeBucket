package com.spring.nifi.adminconsole.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.nifi.adminconsole.model.Ord;

public interface OrdRepository extends CrudRepository<Ord, String> {

   List<Ord> findByRtAdrId(String rtAdrId);
 //  Ord findByOrdernum(String Id);
}
