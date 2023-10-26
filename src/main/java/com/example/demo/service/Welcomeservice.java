package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Welcomeservice {
	

		public String[] getcity()
		{
			return new String[] {"chennai","pune"};
		}
}
