package com.ifreann.home.resources;

import com.ifreann.home.entities.Project;
import com.ifreann.home.services.ProjectsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/projects")
public class ProjectsResource {

    @Inject
    ProjectsService projectsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Project> getProjects() {
        return this.projectsService.getProjects();
    }
}
