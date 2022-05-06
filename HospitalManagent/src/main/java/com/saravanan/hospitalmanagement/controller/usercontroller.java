package com.saravanan.hospitalmanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.saravanan.hospitalmanagement.Entity.Docter;

import com.saravanan.hospitalmanagement.Entity.User;
import com.saravanan.hospitalmanagement.Repository.userrepository;
import com.saravanan.hospitalmanagement.service.Hospitalmanagementservice;




@Controller

public class usercontroller {
	
	
	@Autowired
	userrepository userrep;
	@Autowired
	Hospitalmanagementservice hostser;
	
	@GetMapping("/adminlogin")
	public String login(Model model) {
		User user=new User();
		model.addAttribute("user",user);
		return "adminlogin";
	}
	
	@PostMapping("/userlogin")
public String Users(@ModelAttribute("user") User user) {
		
	System.out.println("Username"+user.getUserid());
	System.out.println("Password"+user.getPassword());
	String userid=user.getUserid();
	Optional<User> userdata=userrep.findById(userid);
	
if(user.getPassword().equals(userdata.get().getPassword())) {
	
	return "adminsucces";
}
else {
return "errorpage";
}
	
	}
@PostMapping("/addminsave")
public String addadmin(@ModelAttribute("user") User user) {
	hostser.saveaddmin(user);
	return "adminlist";
}



@GetMapping("/addadmin")
public String addadmin(Model model) {
	User user= new User();
	model.addAttribute("Userd",user);
	return "Addadmin";
	
	
}


}
	
	

