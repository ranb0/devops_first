package com.devops.poc.spr.repo;

import org.springframework.data.repository.CrudRepository;

import com.devops.poc.spr.model.SdmMasterE;

public interface SPRRepository extends CrudRepository<SdmMasterE, Long> {

}
