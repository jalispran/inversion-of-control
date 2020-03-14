package com.plugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PluginApplication {
	
	@Autowired
	private Contract contract;
	
	@GetMapping
	public String getThis() {
		return contract.getMessageToPrint();
	}

}
