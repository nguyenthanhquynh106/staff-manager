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

import com.quynh.dev.dto.JobDTO;
import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Job;
import com.quynh.dev.service.DepartService;
import com.quynh.dev.service.JobService;

@Controller
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	JobService jobService;

	@Autowired
	DepartService departService;

	@GetMapping("/")
	public String addOrEdit(ModelMap model) {
		JobDTO job = new JobDTO();
		model.addAttribute("JOBDTO", job);
		model.addAttribute("ACTION_JOB", "/jobs/saveOrUpdate");
		return "job";
	}

	@RequestMapping("/list")
	public String listStaff(ModelMap model) {
		model.addAttribute("LIST_JOB", jobService.findAll());
		return "view-jobs";
	}

	@PostMapping("/saveOrUpdate")
	public String save(ModelMap model, @ModelAttribute("JOBDTO") JobDTO dto) throws IOException {
		Optional<Job> optionalJob = jobService.findById(dto.getId());
		Job job = new Job(dto.getId(), dto.getName(), dto.getDescribe(), dto.getStartDate(), dto.getFinishDate(),
				new Depart(dto.getDepartId(), "", 100L));
		jobService.save(job);
		return "job";
	}

	@ModelAttribute(name = "DEPARTS")
	public List<Depart> getAllDeparts() {
		return jobService.findAllDepart();
	}

	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) throws IOException {
		Optional<Job> optionalJob = jobService.findById(id);
		JobDTO dto = null;

		if (optionalJob.isPresent()) {
			Job job = optionalJob.get();

			dto = new JobDTO(job.getId(), job.getName(), job.getDescribe(), job.getStartDate(), job.getFinishDate(),
					job.getDepart().getId());
			model.addAttribute("JOBDTO", dto);
		} else {
			model.addAttribute("JOBDTO", new JobDTO());
		}
		model.addAttribute("ACTION_JOB", "/jobs/saveOrUpdate");
		return "edit-job";
	}

	@RequestMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		jobService.deleteById(id);
		model.addAttribute("LIST_JOB", jobService.findAll());
		return "view-jobs";
	}
}
