package com.example.Registration.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.entity.UserDetails;
import com.example.Registration.repository.MyRepo;
import com.example.Registration.service.MyService;

@Controller
public class UserController {
	
	@Autowired
    private MyRepo myrepo;
	@Autowired
	private MyService service;
	
	@PostMapping("/user")
	public String home() {
		return "sriya";
	}
	@GetMapping("/")
	public String login() {
		return "home";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDetails u) {
//		System.out.println(u);
		myrepo.save(u);
        return "home";
	}
	@PostMapping("/admin")
	public String welcome(@RequestParam String Name,@RequestParam String Password,@RequestParam String type,Model model, UserDetails ud) {
		String uname="Sriya";
		String upwd="1234";
		String uname1="Kavitha";
		String upwd1="8987";
		if(Name.equals("admin") && Password.equals("12345")) {
			model.addAttribute("listUsers",service.getAllUsers());
			return "adminpage";
		}
		else if((uname.equalsIgnoreCase(ud.getName()) && upwd.equalsIgnoreCase(ud.getPassword())) || (uname1.equalsIgnoreCase(ud.getName()) && upwd1.equalsIgnoreCase(ud.getPassword())) ) {
			return "userpage";
		}
		else {
			return "home";
		}
	} 
	
		
	public UserController(MyRepo myrepo, MyService service) {
		super();
		this.myrepo = myrepo;
		this.service = service;
	}
	
	@GetMapping("/users/edit/{id}")
	public String showformforupdate(@PathVariable int id, Model model) {
		
		model.addAttribute("listUsers",service.getUserById(id));
		return "update_user";
		
	}
	
	/*
	 * @GetMapping("/users/{id}") public String updateStudent(@PathVariable int
	 * id,@PathVariable String Name,@PathVariable String Course,@PathVariable String
	 * Courseduration,@ModelAttribute("userdetails") UserDetails student, Model
	 * model) { model.addAttribute("listUsers",service.getAllUsers()); UserDetails
	 * existingStudent = service.getUserById(id); existingStudent.setId(id);
	 * existingStudent.setName(Name); existingStudent.setCourse(Course);
	 * existingStudent.setCourseduration(Courseduration);
	 * service.updateStudent(existingStudent);
	 * 
	 * return "adminpage"; }
	 */
	
	@GetMapping("/users/delete/{id}")
	public String delete(@PathVariable (value="id") int id) {
		
		this.myrepo.deleteById(id);
		return "home";
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	/*
	 * @PostMapping("/users/{id}")
	 * 
	 *     public String updateStudent(@PathVariable Long
	 * id,@ModelAttribute("userdetails") UserDetails student, Model model) {      
	 *         UserDetails existingStudent = service.getUserById(id);        
	 * existingStudent.setId(id);        
	 * existingStudent.setName(student.getName());        
	 * existingStudent.setCourse(student.getCourse());        
	 * existingStudent.setCourseduration(student.getCourseduration());        
	 *         service.updateStudent(existingStudent);         return "update_user";
	 * 
	 * 
	 *     }
	 */
	
	
	
}
	
	
	 
	
	

