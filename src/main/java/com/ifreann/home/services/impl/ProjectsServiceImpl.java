package com.ifreann.home.services.impl;

import com.ifreann.home.entities.Project;
import com.ifreann.home.services.ProjectsService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProjectsServiceImpl implements ProjectsService {

    @Inject
    EntityManager entityManager;

    @Override
    public List<Project> getProjects() {
        final List resultList = entityManager.createNativeQuery("select * from projects", Project.class).getResultList();
        return resultList;
    }
}
