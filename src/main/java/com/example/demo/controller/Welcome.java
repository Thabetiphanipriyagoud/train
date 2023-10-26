package com.example.demo.controller;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.RequestMapping;

@ReadingConverter
@RequestMapping
public class Welcome {

	public String[] getcity()
	{
		return new String[] {"chennai","pune"};
	}
}
