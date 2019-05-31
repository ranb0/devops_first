package com.devops.poc.spr.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.devops.poc.spr.model.SdmMasterE;

public interface SPRRepository extends CrudRepository<SdmMasterE, Long> {

	public List<SdmMasterE> findByMsisdn(String msisdn);
}
