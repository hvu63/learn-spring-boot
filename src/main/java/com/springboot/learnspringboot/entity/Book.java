package com.springboot.learnspringboot.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.springboot.learnspringboot.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private Long id;
	
	private Status status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
