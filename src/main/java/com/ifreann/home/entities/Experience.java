package com.ifreann.home.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Experiences")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    @Column(columnDefinition = "text")
    private String description;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "experiences_technologies",
            joinColumns = {@JoinColumn(name = "experience_id")},
            inverseJoinColumns = {@JoinColumn(name = "technology_Id")}
    )
    private List<Technology> technologiesUsed;
    private Date dateFrom;
    private Date dateTo;
    private boolean current;
    private String location;
    private String platform;

    public Experience() {
    }

    public Experience(Integer id, String title, String description, List<Technology> technologiesUsed, Date dateFrom, Date dateTo, boolean current, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.technologiesUsed = technologiesUsed;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.current = current;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", technologiesUsed=" + technologiesUsed +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", current=" + current +
                ", location='" + location + '\'' +
                '}';
    }
}
