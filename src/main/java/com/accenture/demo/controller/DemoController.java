package com.accenture.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/gettext")
	public String getText(Model model){
	
		Random rand = new Random();
	    List<String> givenList = Arrays.asList("Nico", "Dom", "Vicente", "Santi Dope");
	    String randomElement="";
	    int numberOfElements = 2;
	 
	    for (int i = 0; i < numberOfElements; i++) {
	        int randomIndex = rand.nextInt(givenList.size());
	        randomElement = givenList.get(randomIndex);
	    }
	    model.addAttribute("message",randomElement);
	
	return "home";
		
		
	}
}
