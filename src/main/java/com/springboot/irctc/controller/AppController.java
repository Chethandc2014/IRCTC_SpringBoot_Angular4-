package com.springboot.irctc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping(value="/app")
public class AppController {

	
	@RequestMapping(value="/getAppDetails")
	public ObjectNode getApplicationDetals(){
		
		ObjectMapper mapper=new ObjectMapper();
		ObjectNode response = mapper.createObjectNode();
		response.put("appName", "INDIAN RAILWAYS");
		response.put("copyRights", "@2017");
		return response;
	}
	
}
