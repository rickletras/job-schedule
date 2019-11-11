package com.ricardo.jobschedule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.jobschedule.domain.ScheduleJobs;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleJobs, Integer> {

}
