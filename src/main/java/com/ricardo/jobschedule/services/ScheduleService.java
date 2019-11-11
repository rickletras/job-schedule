package com.ricardo.jobschedule.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.jobschedule.domain.ScheduleJobs;
import com.ricardo.jobschedule.repositories.ScheduleRepository;
import com.ricardo.jobschedule.services.exceptions.ObjectNotFoundException;

@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	public ScheduleJobs find(Integer id) {
		Optional<ScheduleJobs> schedule = scheduleRepository.findById(id);
		return schedule.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ScheduleJobs.class.getName()));
	}
}
