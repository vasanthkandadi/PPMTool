package com.jira_app.ppmtool.repositories;

import com.jira_app.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    Project findByProjectIdentifier(String projectID);

    @Override
    List<Project> findAll();
}
