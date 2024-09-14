package com.automationpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoMationBuildingController {
	@GetMapping(value="/get")
	public String get() {
		return "Hi da Velu mavaneyyyy";
	}
}
