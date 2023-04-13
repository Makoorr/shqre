package com.example.tp_work.services;

import com.example.tp_work.entities.Enseignant;

import java.util.List;

public interface EnseignantService {
    List<Enseignant> retrieveAllEnseignants();
    Enseignant addEnseignant(Enseignant enseignant);
    void deleteEnseignant(Long id);
    Enseignant updateEnseignant(Enseignant enseignant);
    Enseignant retrieveEnseignant(Long id);
}
