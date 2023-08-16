package com.microservices.limitservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.limitservice.configuration.LimitConfiguration;
import com.microservices.limitservice.limitservice.dao.LimitDao;

@RestController
@RequestMapping("/api")
public class LimitServiceController {
	@Autowired
	private LimitConfiguration configuration;
	@GetMapping("/")
	public String test() {
		return "karthik";
	}
	
	@GetMapping("/get-limit-service")
	public LimitDao getLimitService() {
		return new LimitDao(configuration.getMinimum(),configuration.getMaximum());
	}
}
