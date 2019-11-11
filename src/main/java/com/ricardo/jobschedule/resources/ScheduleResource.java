package com.ricardo.jobschedule.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.jobschedule.domain.ScheduleJobs;
import com.ricardo.jobschedule.services.ScheduleService;

@RestController
@RequestMapping(value = "/schedules")
public class ScheduleResource {
	
	@Autowired
	private ScheduleService scheduleService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> list(@PathVariable Integer id) {
		
		ScheduleJobs scheduleObj = scheduleService.find(id);
		return ResponseEntity.ok(scheduleObj);
	}
}
