package com.ricardo.jobschedule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.jobschedule.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

}
