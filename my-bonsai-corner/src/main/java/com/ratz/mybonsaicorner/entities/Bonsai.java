package com.ratz.mybonsaicorner.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bonsai")
public class Bonsai {

    @Id
    @Column(name = "id")
    private String id;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Bonsai() {
    }

    public Bonsai(String name, String specie, String dateOfCreation, String image, String description, User user) {
        this.name = name;
        this.specie = specie;
        this.dateOfCreation = dateOfCreation;
        this.image = image;
        this.description = description;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bonsai{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
