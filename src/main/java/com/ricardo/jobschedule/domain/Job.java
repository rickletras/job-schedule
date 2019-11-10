package com.ricardo.jobschedule.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dateMaxFinish;
	@NotNull
	private double timeEstipulate;

	public Job() {
	}

	public Job(String description, Date dateMaxFinish, double timeEstipulate) {
		this.description = description;
		this.dateMaxFinish = dateMaxFinish;
		this.timeEstipulate = timeEstipulate;
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
