package com.ratz.mybonsaicorner.entities;


import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "bonsai")
public class Bonsai {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    @NotNull(message = "Cant be null")
    @NotEmpty(message = "Cant be empty")
    @Size(min = 2, max = 30,message = "Cant be lower than 2 or longer than 30")
    private String name;

    @Column(name = "specie")
    @Size(min = 2, max = 130)
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

    @OneToMany(mappedBy = "bonsai", cascade = CascadeType.ALL)
    private List<Intervention> interventionList = new ArrayList<>();


    public Bonsai() {
    }

    public Bonsai(String name, String specie, String dateOfCreation, String image, String description, User user, List<Intervention> interventionList) {
        this.name = name;
        this.specie = specie;
        this.dateOfCreation = dateOfCreation;
        this.image = image;
        this.description = description;
        this.user = user;
        this.interventionList = interventionList;
    }

    public List<Intervention> getInterventionList() {
        return interventionList;
    }

    public void setInterventionList(List<Intervention> interventionList) {
        this.interventionList = interventionList;
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
