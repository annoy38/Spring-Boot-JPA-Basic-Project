package com.springJPAproject.JPAproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springJPAproject.JPAproject.customer.customerClass;
import com.springJPAproject.JPAproject.repository.IcustomerRepository;


@Controller
public class controllerClass {

	@Autowired
	IcustomerRepository repo;
	
	@ModelAttribute
	public void headerPart(Model title) {
		title.addAttribute("title", "Hayder Automobile Ltd.");
	}
	
	@GetMapping("/")
	public String homePage() {
		return "homePage.html";
	}
	
	@PostMapping("/saveInfo")
	public ModelAndView save_customer_data(@ModelAttribute ("customer") customerClass customer) {
		ModelAndView model = new ModelAndView();
		repo.save(customer);
		model.setViewName("userInfo.html");
		
		return model;
	}
	
	@GetMapping("/allcustomers")
	public String allCustomerData(Model m) {
		List<customerClass> c = new ArrayList<customerClass>();
		c.add(new customerClass(101,"Annoy", "Narayanganj", 50000, "41258963"));
		c.add(new customerClass(102, "Fahim", "Narayanganj", 40000, "85968963"));
		c.add(new customerClass(103, "Riaz", "Dhaka", 900000, "41257485"));
		c.add(new customerClass(104, "Rayna", "Dhanmondi", 30000, "41785963"));
		c.add(new customerClass(105, "Anasua", "Foridpur", 1000000, "6521498"));
		m.addAttribute("customers", c);
		
		return "allUser.html";
	}
}
