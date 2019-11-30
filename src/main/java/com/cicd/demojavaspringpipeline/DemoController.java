package com.cicd.demojavaspringpipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String getDemo() {
		return "Hello world";
	}
}
