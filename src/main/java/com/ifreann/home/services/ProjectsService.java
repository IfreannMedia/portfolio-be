package com.ifreann.home.services;

import com.ifreann.home.entities.Project;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface ProjectsService {

    public List<Project> getProjects();
}
