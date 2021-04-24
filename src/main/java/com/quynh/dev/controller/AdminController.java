	package com.quynh.dev.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quynh.dev.dto.StaffDTO;
import com.quynh.dev.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/")
	public String display() {
		return "login";
	}

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@PostMapping("/home")
	public String checkLogin(ModelMap model, @RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session) {
		if (adminService.checkLogin(username, password)) {
			System.out.println("Login thành công");
			session.setAttribute("USERNAME", username);
			return "home";
		} else {
			System.out.println("Login thất bại");
			model.addAttribute("ERROR", "Username and password not exist");
		}
		return "login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("USERNAME");
		return "redirect:/login";
	}
	
	@GetMapping("/goHome")
	public String goHome() {
		return "home";
	}
}
