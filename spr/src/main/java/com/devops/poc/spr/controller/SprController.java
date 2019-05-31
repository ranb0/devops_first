package com.devops.poc.spr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devops.poc.spr.model.SdmMasterE;
import com.devops.poc.spr.repo.SPRRepository;

@RestController
@RequestMapping(value = {"/spr"})
public class SprController {

	@Autowired
	private SPRRepository repository;
	
	@GetMapping(value= {"/getProfile"})
	public List<SdmMasterE> getSprProfile(@RequestParam(required=true, name="msisdn") String msisdn, HttpServletRequest req) throws Exception {
		return repository.findByMsisdn(msisdn);
	}

	public SPRRepository getRepository() {
		return repository;
	}

	public void setRepository(SPRRepository repository) {
		this.repository = repository;
	}
	
}
