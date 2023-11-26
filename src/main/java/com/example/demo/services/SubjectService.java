package com.example.demo.services;

import com.example.demo.entities.Subject;

public interface SubjectService {

	public Iterable<Subject> findAll();
	
	public Subject find(int id);
	
	public Subject save(Subject subject);
	
	public void delete(int id);
	
}
