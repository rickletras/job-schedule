package com.ricardo.jobschedule.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dateMaxFinish;
	@NotNull
	private double timeEstipulate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private ScheduleJobs schedule;

	public Job() {
	}

	public Job(Integer id, String description, Date dateMaxFinish, double timeEstipulate, ScheduleJobs schedule) {
		this.id = id;
		this.description = description;
		this.dateMaxFinish = dateMaxFinish;
		this.timeEstipulate = timeEstipulate;
		this.schedule = schedule;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateMaxFinish() {
		return dateMaxFinish;
	}

	public void setDateMaxFinish(Date dateMaxFinish) {
		this.dateMaxFinish = dateMaxFinish;
	}

	public double getTimeEstipulate() {
		return timeEstipulate;
	}

	public void setTimeEstipulate(double timeEstipulate) {
		this.timeEstipulate = timeEstipulate;
	}
	
	public ScheduleJobs getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleJobs schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", description=" + description + ", dateMaxFinish=" + dateMaxFinish
				+ ", timeEstipulate=" + timeEstipulate + "]";
	}	
}
