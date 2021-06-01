package com.quynh.dev.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.quynh.dev.dto.StaffDTO;
import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Role;
import com.quynh.dev.model.Staff;
import com.quynh.dev.service.DepartService;
import com.quynh.dev.service.RoleService;
import com.quynh.dev.service.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffController {

	@Autowired
	StaffService staffService;

	@Autowired
	DepartService departService;
	
	@Autowired
	RoleService roleService;

	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		StaffDTO staff = new StaffDTO();
		model.addAttribute("STAFFDTO", staff);
		model.addAttribute("ACTION", "/staffs/saveOrUpdate");
		return "staff";
	}

	@RequestMapping("/list")
	public String listStaff(ModelMap model) {
		model.addAttribute("LIST_STAFF", staffService.findAll());
		return "view-staffs";
	}

	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("STAFFDTO") StaffDTO dto) throws IOException {
		Optional<Staff> optionalStaff = staffService.findById(dto.getId());
		Staff staff = null;
		String image = "Logo.png";
		Path path = Paths.get("uploads/");
		if (optionalStaff.isPresent()) {
			if (!dto.getPhoto().isEmpty()) {
				InputStream inputStream = dto.getPhoto().getInputStream();
				Files.copy(inputStream, path.resolve(dto.getPhoto().getOriginalFilename()),
						StandardCopyOption.REPLACE_EXISTING);
				image = dto.getPhoto().getOriginalFilename().toString();
			}
		} else {
			if (!dto.getPhoto().isEmpty()) {
				InputStream inputStream = dto.getPhoto().getInputStream();
				Files.copy(inputStream, path.resolve(dto.getPhoto().getOriginalFilename()),
						StandardCopyOption.REPLACE_EXISTING);
				image = dto.getPhoto().getOriginalFilename().toString();
			}
		}
		staff = new Staff(dto.getId(), dto.getName(), dto.isGender(), dto.getBirthday(), image, dto.getEmail(),
				dto.getPhone(), dto.getNotes(), new Depart(dto.getDepartId(), "", 100L),
				new Role(dto.getRoleId(), "", 100L, 50L));
		staffService.save(staff);
		return "staff";
	}

	@ModelAttribute(name = "DEPARTS")
	public List<Depart> getAllDeparts() {
		return staffService.findAllDepart();
	}
	
	@ModelAttribute(name = "ROLES")
	public List<Role> getAllRoles() {
		return staffService.findAllRole();
	}

	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) throws IOException {
		Optional<Staff> optionalStaff = staffService.findById(id);
		StaffDTO dto = null;
		if (optionalStaff.isPresent()) {
			Staff staff = optionalStaff.get();
			File file = new File("uploads/" + staff.getPhoto());
			FileInputStream input = new FileInputStream(file);
			MultipartFile multiPhoto = new MockMultipartFile("file", file.getName(), "text/plain",
					IOUtils.toByteArray(input));
			dto = new StaffDTO(staff.getId(), staff.getName(), staff.isGender(), staff.getBirthday(), multiPhoto,
					staff.getEmail(), staff.getPhone(), staff.getNotes(), staff.getDepart().getId(),
					staff.getRole().getId());
			model.addAttribute("STAFFDTO", dto);
		} else {
			model.addAttribute("STAFFDTO", new StaffDTO());
		}
		model.addAttribute("ACTION", "/staffs/saveOrUpdate");
		return "edit-staff";
	}

	@RequestMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		try {
			staffService.deleteById(id);
		} catch (Exception ex) {
			System.err.println("Bảng này không xóa được hihi");
		}
		model.addAttribute("LIST_STAFF", staffService.findAll());
		return "view-staffs";
	}
}
