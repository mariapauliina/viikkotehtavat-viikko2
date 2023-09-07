package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Friend;
import com.example.demo.domain.Student;

@Controller
public class DemoController {
	@RequestMapping("/index")
	@ResponseBody
	public String kotisivu() {
	return "This is main page";
	
}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String yhteystiedot() {
	return "This is the contact page";
}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hellos(@RequestParam(name="name") String name, @RequestParam(name="location") String location)  {
	return "Welcome to the " + location + " " + name;
}
	@RequestMapping("/studentList")
	// kovakoodatut oppilaat
	public String studentsPage(Model model) {
	List<Student> oppilaat= new ArrayList<>();
	oppilaat.add(new Student("Ron", "Weasley"));
	oppilaat.add(new Student("Harry", "Potter"));
	//model olio välittää tiedot thymeleafille
	model.addAttribute("students", oppilaat);
	return("studentList");
	}
	
	@GetMapping("/helloThymeleaf")
	 public String hello(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return("helloThymeleafTemplate");
       
		
	}
	private List<Friend> friends = new ArrayList<>();
	@GetMapping("/friendList")
	public String friendsListing(Model model) {
		model.addAttribute("friend", new Friend());
		model.addAttribute("friends", friends);
		return("friendList");
	}
	@PostMapping("/addFriend")
	public String addFriend(@ModelAttribute Friend friend, Model model ) {
		friends.add(friend); // lisätään ystävä listalle
		model.addAttribute("friends", friends); // listaa päivitetään
		return "/friendList";
	}
	
}