package com.ricardo.jobschedule.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.jobschedule.domain.Job;
import com.ricardo.jobschedule.repositories.JobRepository;
import com.ricardo.jobschedule.services.exceptions.ObjectNotFoundException;
@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	public Job find(Integer id) {
		Optional<Job> job = jobRepository.findById(id);
		return job.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Job.class.getName()));
	}

	public Job insert(Job job) {
		job.setId(null);
		return jobRepository.save(job);
	}
}
