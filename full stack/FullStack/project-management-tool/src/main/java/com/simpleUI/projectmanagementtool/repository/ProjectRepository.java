package com.simpleUI.projectmanagementtool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simpleUI.projectmanagementtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	Project findByprojectIdentifier(String projectIdentifier);
	
	Iterable<Project> findAllByProjectLead(String username);
	
	
	


}
	


