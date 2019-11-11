package com.ricardo.jobschedule.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Job job) {
		job = jobService.insert(job);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(job.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
