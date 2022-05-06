package com.saravanan.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springsecuritycontroller {

@GetMapping("/secure")
public String secure() {
	
	return "succes";
	
}

}
