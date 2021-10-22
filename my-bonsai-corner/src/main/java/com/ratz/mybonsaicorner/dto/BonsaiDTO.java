package com.ratz.mybonsaicorner.dto;



public class BonsaiDTO {

    private String id;

    private String name;

    private String specie;

    private String dateOfCreation;

    private String image;

    private String description;


    public BonsaiDTO(String id, String name, String specie, String dateOfCreation, String image, String description) {
        this.id = id;
        this.name = name;
        this.specie = specie;
        this.dateOfCreation = dateOfCreation;
        this.image = image;
        this.description = description;
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

    @Override
    public String toString() {
        return "BonsaiDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
