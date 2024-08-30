package com.jira_app.ppmtool.web;

import com.jira_app.ppmtool.domain.Project;
import com.jira_app.ppmtool.services.MapValidationErrorService;
import com.jira_app.ppmtool.services.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectService projectService;
    private final MapValidationErrorService mapValidationErrorService;
@Autowired
    public ProjectController(ProjectService projectService, MapValidationErrorService mapValidationErrorService) {
        this.projectService = projectService;
        this.mapValidationErrorService = mapValidationErrorService;
}

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){

        if(result.hasErrors()) {
            return mapValidationErrorService.mapValidate(result);
        }

        projectService.saveOrUpdate(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
    @GetMapping("/{projectID}")
    public Optional<Project> getProjectByID(@PathVariable("projectID") String projectID){
        return projectService.findProjectByPID(projectID);
    }

    @GetMapping("")
    public List<Project> getAllProjects(){
        return projectService.findAllProjects();
    }

}
