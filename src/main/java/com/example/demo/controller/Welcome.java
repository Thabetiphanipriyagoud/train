package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {

	public String[] getcity()
	{
		return new String[] {"chennai","pune"};
	}
}
