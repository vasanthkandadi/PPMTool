package com.jira_app.ppmtool.services;

import com.jira_app.ppmtool.domain.Project;
import com.jira_app.ppmtool.exceptions.ProjectIDException;
import com.jira_app.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
@Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project saveOrUpdate(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch(Exception ex){
            throw new ProjectIDException("Project ID : " + project.getProjectIdentifier() + " already exists");
        }
    }
}
