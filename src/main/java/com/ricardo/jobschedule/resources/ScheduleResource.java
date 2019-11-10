package com.ricardo.jobschedule.resources;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.jobschedule.domain.Job;

@RestController
@RequestMapping(value = "/schedules")
public class ScheduleResource {
	
	@GetMapping
	public List<Job> list() throws ParseException{
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Job job1 = new Job("Importação de arquivos de fundos", format.parse("2019-11-10 12:00:00"), 2.0);
		Job job2 = new Job("Importação de dados da Base Legada", format.parse("2019-11-11 12:00:00"), 4.0);
		Job job3 = new Job("Importação de dados de integração", format.parse("2019-11-11 08:00:00"), 6.0);
		List<Job> listJobs = new ArrayList<>();
		listJobs.addAll(Arrays.asList(job1, job2, job3));
		
		return listJobs;
	}
}
