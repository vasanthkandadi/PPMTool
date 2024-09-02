package com.jira_app.ppmtool.exceptions;

public class ProjectIDExceptionResponse {
    private String projectIdentifier;

    public ProjectIDExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }
    public void setProjectIdentifier(String projectId){
        this.projectIdentifier = projectIdentifier;
    }

}
