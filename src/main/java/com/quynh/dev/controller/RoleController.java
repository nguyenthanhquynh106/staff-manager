package com.quynh.dev.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quynh.dev.dto.RoleDTO;
import com.quynh.dev.model.Role;
import com.quynh.dev.service.RoleService;

@Controller
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		RoleDTO role = new RoleDTO();
		model.addAttribute("ROLEDTO", role);
		model.addAttribute("ACTION_ROLE", "/roles/saveOrUpdate");
		return "role";
	}

	@GetMapping("/list")
	public String listRoles(ModelMap model) {
		model.addAttribute("ROLE_STAFF", roleService.findAll());
		return "view-roles";
	}

	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("ROLEDTO") RoleDTO dto) throws IOException {
		Role role = new Role(dto.getId(), dto.getName(), dto.getBasicSalary(), dto.getSubSalary());
		roleService.save(role);
		return "role";
	}

	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) throws IOException {
		Optional<Role> optionalRole = roleService.findById(id);
		RoleDTO dto = null;
		if (optionalRole.isPresent()) {
			Role role = optionalRole.get();
			dto = new RoleDTO(role.getId(), role.getName(), role.getBasicSalary(), role.getSubSalary());
			model.addAttribute("ROLEDTO", dto);
		} else {
			model.addAttribute("ROLEDTO", new RoleDTO());
		}
		model.addAttribute("ACTION_ROLE", "/roles/saveOrUpdate");
		return "edit-role";
	}

	@RequestMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		roleService.deleteById(id);
		model.addAttribute("ROLE_STAFF", roleService.findAll());
		return "view-roles";
	}
}
