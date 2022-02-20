package com.ifreann.home.entities;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Projects")
@TypeDefs({
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        )
})
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "text")
    private String description;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "projects_technologies",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "technology_Id")}
    )
    private List<Technology> technologiesUsed;
    private String projectType;
    private String imageUrl;
    @Type(type = "string-array")
    @Column(
            name = "github_urls",
            columnDefinition = "text[]"
    )
    private String[] githubUrls;
    private String accessUrl;

    public Project() {
    }

    public Project(Integer id, String name, String description, List<Technology> technologiesUsed, String projectType, String imageUrl, String[] githubUrls, String accessUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.technologiesUsed = technologiesUsed;
        this.projectType = projectType;
        this.imageUrl = imageUrl;
        this.githubUrls = githubUrls;
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

    public List<Technology> getTechnologiesUsed() {
        return technologiesUsed;
    }

    public void setTechnologiesUsed(List<Technology> technologiesUsed) {
        this.technologiesUsed = technologiesUsed;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String[] getGithubUrls() {
        return githubUrls;
    }

    public void setGithubUrls(String[] githubUrls) {
        this.githubUrls = githubUrls;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }
}
