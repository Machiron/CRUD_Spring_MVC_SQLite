package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Subject;
import com.example.demo.repositories.SubjectRepo;


@Service("SubjectService")
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	private SubjectRepo subjectRepo;
	
	@Override
	public Iterable<Subject> findAll() {
		return subjectRepo.findAll();
	}

	@Override
	public Subject find(int id) {
		return subjectRepo.findById(id).get();
	}

	@Override
	public Subject save(Subject subject) {
		return subjectRepo.save(subject);
	}

	@Override
	public void delete(int id) {
		subjectRepo.deleteById(id);
		
	}

}
