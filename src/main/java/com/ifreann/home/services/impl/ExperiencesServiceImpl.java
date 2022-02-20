package com.ifreann.home.services.impl;

import com.ifreann.home.entities.Experience;
import com.ifreann.home.services.ExperiencesService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ExperiencesServiceImpl implements ExperiencesService {

    @Inject
    EntityManager entityManager;

    @Override
    public List<Experience> getExperiences() {
        final List resultList = entityManager.createNativeQuery("select * from experiences", Experience.class).getResultList();
        return resultList;
    }
}
