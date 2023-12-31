package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Subject;

@Repository("subjectRepository")
public interface SubjectRepo extends CrudRepository<Subject, Integer>{

}
