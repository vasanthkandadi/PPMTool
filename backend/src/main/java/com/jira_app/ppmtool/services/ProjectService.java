package com.jira_app.ppmtool.services;

import com.jira_app.ppmtool.domain.Project;
import com.jira_app.ppmtool.exceptions.ProjectIDException;
import com.jira_app.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
@Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void saveOrUpdate(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            projectRepository.save(project);
        }catch(Exception ex){
            throw new ProjectIDException("Project ID : " + project.getProjectIdentifier() + " already exists");
        }
    }

    public Project findProjectByPID(String projectID){
       Project project  =  projectRepository.findByProjectIdentifier(projectID.toUpperCase());
       if(project == null){
           throw new ProjectIDException("Project ID : " + projectID + " does not exist");
       }
       return project;
    }

    public List<Project> findAllProjects(){
        return projectRepository.findAll();
    }

    public void deleteProjectByPID(String projectID){
        Project project = findProjectByPID(projectID);
        if(project == null){
            throw new ProjectIDException("Cannot delete project with " + projectID + " ." + "It does not exist");
        }
        projectRepository.delete(project);
    }
}
