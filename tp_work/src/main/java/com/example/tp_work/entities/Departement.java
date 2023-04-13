package com.example.tp_work.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Departement {
    @Id
    private int id;

    private String nom;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private University university;

    @ManyToMany(mappedBy = "departements")
    private List<Enseignant> enseignants = new ArrayList<>();

    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;

}
