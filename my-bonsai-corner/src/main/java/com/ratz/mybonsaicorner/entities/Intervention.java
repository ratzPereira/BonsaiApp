package com.ratz.mybonsaicorner.entities;

import com.ratz.mybonsaicorner.enums.InterventionStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "intervention")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @CreationTimestamp
    private Date interventionDate;


    @Column(name = "images")
    private String images;

    private String interventionDescription;

    @Enumerated(EnumType.ORDINAL)
    private InterventionStatus interventionStatus;

    @ManyToOne
    @JoinColumn(name = "bonsai_id")
    private Bonsai bonsai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bonsai getBonsai() {
        return bonsai;
    }

    public void setBonsai(Bonsai bonsai) {
        this.bonsai = bonsai;
    }

    public Date getInterventionDate() {
        return interventionDate;
    }

    public void setInterventionDate(Date interventionDate) {
        this.interventionDate = interventionDate;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getInterventionDescription() {
        return interventionDescription;
    }

    public void setInterventionDescription(String interventionDescription) {
        this.interventionDescription = interventionDescription;
    }

    public Enum<InterventionStatus> getInterventionStatus() {
        return interventionStatus;
    }

    public void setInterventionStatus(InterventionStatus interventionStatus) {
        this.interventionStatus = interventionStatus;
    }
}
