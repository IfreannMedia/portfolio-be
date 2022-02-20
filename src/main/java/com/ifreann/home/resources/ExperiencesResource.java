package com.ifreann.home.resources;

import com.ifreann.home.entities.Experience;
import com.ifreann.home.services.ExperiencesService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/experiences")
public class ExperiencesResource {

    @Inject
    ExperiencesService experiencesService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Experience> getExperiences() {
        return this.experiencesService.getExperiences();
    }
}
