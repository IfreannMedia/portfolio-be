package com.ifreann.home.entities;

import javax.persistence.*;

@Entity
@Table(name = "Projects")
//@NamedQueries({
//        @NamedQuery(name = "Project.selectAll", query = "select * from Projects")
//})
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer technologiesUsed;
    private Integer projectType;
    private String imageUrl;
    private String githubUrl;
    private String accessUrl;

    public Project() {
    }

    public Project(Integer id,String name, String description, Integer technologiesUsed, Integer projectType, String imageUrl, String githubUrl, String accessUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologiesUsed = technologiesUsed;
        this.projectType = projectType;
        this.imageUrl = imageUrl;
        this.githubUrl = githubUrl;
        this.accessUrl = accessUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(Integer technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }
}
