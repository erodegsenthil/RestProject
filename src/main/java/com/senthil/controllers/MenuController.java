package com.senthil.controllers;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

	static final Set<String> cache = new HashSet<>();
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@GetMapping("/getmenu")
	public Set<String> getMenu() {
		return cache;
	}
	
	@PostMapping("/loadmenu")
	public void loadMenu(@RequestParam(name = "menuname", defaultValue = "Halwa") String menuName) {
		cache.add(menuName);
	}
}

