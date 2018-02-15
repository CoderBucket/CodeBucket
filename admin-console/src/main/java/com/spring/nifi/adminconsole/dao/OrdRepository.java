package com.spring.nifi.adminconsole.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.nifi.adminconsole.model.Ord;

public interface OrdRepository extends CrudRepository<Ord, String> {

}
