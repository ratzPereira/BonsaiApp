package com.ratz.mybonsaicorner.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bonsai")
public class Bonsai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "specie")
    private String specie;

    @Column(name = "date_of_creation")
    //@CreationTimestamp
    private String dateOfCreation;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;


    public Bonsai() {
    }

    public Bonsai(Integer id, String name, String specie, String dateOfCreation, String image, String description) {
        this.id = id;
        this.name = name;
        this.specie = specie;
        this.dateOfCreation = dateOfCreation;
        this.image = image;
        this.description = description;
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

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
