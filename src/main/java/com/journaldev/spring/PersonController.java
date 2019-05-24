package com.journaldev.spring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@EnableJms
public class PersonController {
	
	@Autowired
    private JmsTemplate jmsTemplate;
	 
	@RequestMapping("/")
	public String welcome() {
		jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World!");
		return "Welcome to Spring Boot REST...";
	}
	
}
