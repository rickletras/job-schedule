package com.ricardo.jobschedule.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.jobschedule.domain.Job;
import com.ricardo.jobschedule.services.JobService;

@RestController
@RequestMapping(value = "/jobs")
public class JobResource {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> list(@PathVariable Integer id) {
		
		Job jobObj = jobService.find(id);
		return ResponseEntity.ok(jobObj);
	}
}
