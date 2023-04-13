package com.example.tp_work.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String enseignantNom;
    private String enseignantPrenom;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEnseignantNom() {
        return enseignantNom;
    }
    public void setEnseignantNom(String enseignantNom) {
        this.enseignantNom = enseignantNom;
    }
    public String getEnseignantPrenom() {
        return enseignantPrenom;
    }
    public void setEnseignantPrenom(String enseignantPrenom) {
        this.enseignantPrenom = enseignantPrenom;
    }

    @ManyToMany
    @JoinTable(
            name = "departement_enseignant",
            joinColumns = @JoinColumn(name = "enseignant_id"),
            inverseJoinColumns = @JoinColumn(name = "departement_id"))
    private List<Departement> departements = new ArrayList<>();

}
