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

import com.quynh.dev.dto.DepartDTO;
import com.quynh.dev.dto.StaffDTO;
import com.quynh.dev.model.Depart;
import com.quynh.dev.service.DepartService;

@Controller
@RequestMapping("/departs")
public class DepartController {

	@Autowired
	DepartService departService;

	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		DepartDTO depart = new DepartDTO();
		model.addAttribute("DEPARTDTO", depart);
		model.addAttribute("ACTION_DEPART", "/departs/saveOrUpdate");
		return "depart";
	}

	@GetMapping("/list")
	public String listDeparts(ModelMap model) {
		model.addAttribute("DEPART_STAFF", departService.findAll());
		return "view-departs";
	}

	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("DEPARTDTO") DepartDTO dto) throws IOException {
		Depart depart = new Depart(dto.getId(), dto.getName(), dto.getNumberStaffs());
		departService.save(depart);
		return "depart";
	}

	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) throws IOException {
		Optional<Depart> optionalDepart = departService.findById(id);
		DepartDTO dto = null;
		if (optionalDepart.isPresent()) {
			Depart depart = optionalDepart.get();
			dto = new DepartDTO(depart.getId(), depart.getName(), depart.getNumberStaffs());
			model.addAttribute("DEPARTDTO", dto);
		} else {
			model.addAttribute("DEPARTDTO", new StaffDTO());
		}
		model.addAttribute("ACTION_DEPART", "/departs/saveOrUpdate");
		return "edit-depart";
	}

	@RequestMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		try {
			departService.deleteById(id);
		} catch(Exception ex) {
			System.err.println("Bảng này không xóa được hihi");
		}
		model.addAttribute("DEPART_STAFF", departService.findAll());
		return "view-departs";
	}
}
