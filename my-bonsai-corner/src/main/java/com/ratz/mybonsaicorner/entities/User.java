package com.ratz.mybonsaicorner.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    @Size(min = 2,max = 100, message = "User name must contain 2 letters minimum or 100 maximum ")
    private String userName;

    @Column(name = "first_name")
    @Size(min = 2,max = 100 , message = "First name must contain 2 letters minimum or 100 maximum ")
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 2,max = 100, message = "Last Name must contain 2 letters minimum or 100 maximum ")
    private String lastName;

    @Column(name = "email")
    @Email(message = "Please insert valid email")
    private String email;

    @Size(min = 7,max = 100, message = "Password must contain 7 characters minimum or 100 maximum ")
    @Column(name = "password")
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Bonsai> bonsaiList = new ArrayList<>();

    public User() {
    }

    public User(String userName, String firstName, String lastName, String email, String password, List<Bonsai> bonsaiList) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.bonsaiList = bonsaiList;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Bonsai> getBonsaiList() {
        return bonsaiList;
    }

    public void setBonsaiList(List<Bonsai> bonsaiList) {
        this.bonsaiList = bonsaiList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bonsaiList=" + bonsaiList +
                '}';
    }
}
