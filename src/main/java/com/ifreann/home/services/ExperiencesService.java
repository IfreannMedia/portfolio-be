package com.ifreann.home.services;

import com.ifreann.home.entities.Experience;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface ExperiencesService {
    public List<Experience> getExperiences();
}
