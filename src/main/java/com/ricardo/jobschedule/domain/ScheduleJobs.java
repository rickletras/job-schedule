package com.ricardo.jobschedule.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ScheduleJobs implements Serializable, Comparable<Job> {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

	@OneToMany(mappedBy = "schedule")
	private List<Job> jobs = new ArrayList<>();

	public ScheduleJobs() {
	}

	public ScheduleJobs(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// retorna uma lista de jobs ordenada por prioridade
	public static List<Job> getListOrdenedJobs(List<Job> listJobs) {
		//Collections.sort(listJobs);

		return listJobs;
	}
	
	@Override
	public String toString() {
		return "ScheduleJobs [id=" + id + ", jobs=" + jobs + "]";
	}

	@Override
	public int compareTo(Job o) {
		return 0;//getDateMaxFinish().compareTo(o.getDateMaxFinish());
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
}
