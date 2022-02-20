package com.ifreann.home.entities;

import javax.persistence.*;

@Entity
@Table(name = "About")
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "text")
    private String description;
}
