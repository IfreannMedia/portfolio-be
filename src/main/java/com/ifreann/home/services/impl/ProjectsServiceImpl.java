package com.ifreann.home.services.impl;

import com.ifreann.home.entities.Project;
import com.ifreann.home.services.ProjectsService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class ProjectsServiceImpl implements ProjectsService {

    @Inject
    EntityManager entityManager;

    @Override
    public List<Project> getProjects() throws SQLException {
        return entityManager.createQuery("select * from projects", Project.class).getResultList();
//        final CallableStatement statement = dataSource.getConnection().prepareCall("select * from public.test");
//        statement.execute();
//        final ResultSet set = statement.getResultSet();
//        System.out.println("set: " + set);
//        set.next();
//        System.out.println("set: " + set.getString("name"));
//        return new ArrayList<>();
    }
}
