package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyRestController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello1";
	}
	
	@RequestMapping("/hi")
	public List<String> Byehello() {
		List<String> names=new ArrayList<>();
		names.add("hello1");
		names.add("hello2");
		names.add("hello3");
		names.add("hello4");
		names.add("hello5");
		names.add("hello6");
		names.add("hello7");


		return names;
	}

}
