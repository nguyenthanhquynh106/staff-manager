package com.quynh.dev.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quynh.dev.dto.SalaryDTO;
import com.quynh.dev.model.Salary;
import com.quynh.dev.model.Staff;
import com.quynh.dev.service.SalaryService;
import com.quynh.dev.service.StaffService;

@Controller
@RequestMapping("/salaries")
public class SalaryController {

	@Autowired
	SalaryService salaryService;

	@Autowired
	StaffService staffService;

	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		SalaryDTO salary = new SalaryDTO();
		model.addAttribute("SALARYDTO", salary);
		model.addAttribute("ACTION_SALARY", "/salaries/saveOrUpdate");
		return "salary";
	}

	@RequestMapping("/list")
	public String listSalary(ModelMap model) {
		model.addAttribute("LIST_SALARY", salaryService.findAll());
		return "view-salaries";
	}

	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("SALARYDTO") SalaryDTO dto) throws IOException {
		Salary salary = new Salary(dto.getId(), dto.getSalaryFactor(), new Staff(dto.getStaffId()));
		salaryService.save(salary);
		return "salary";
	}

	@ModelAttribute(name = "STAFFS")
	public List<Staff> getAllStaffs() {
		return salaryService.findAllStaff();
	}

	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) throws IOException {
		Optional<Salary> optionalSalary = salaryService.findById(id);
		SalaryDTO dto = null;
		if (optionalSalary.isPresent()) {
			Salary salary = optionalSalary.get();
			dto = new SalaryDTO(salary.getId(), salary.getSalaryFactor(), salary.getStaff().getId());
			model.addAttribute("SALARYDTO", dto);
		} else {
			model.addAttribute("SALARYDTO", new SalaryDTO());
		}
		model.addAttribute("ACTION_SALARY", "/salaries/saveOrUpdate");
		return "edit-salary";
	}

	@RequestMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		salaryService.deleteById(id);
		model.addAttribute("LIST_SALARY", salaryService.findAll());
		return "view-salaries";
	}
}
