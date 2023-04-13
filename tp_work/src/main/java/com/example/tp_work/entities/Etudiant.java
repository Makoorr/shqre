package com.example.tp_work.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Etudiant {
    @Id
    private Long id;

    private String nom;
    private String prenom;

    private Date dateOfBirth;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;

}
