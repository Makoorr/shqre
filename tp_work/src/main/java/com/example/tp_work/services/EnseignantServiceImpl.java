package com.example.tp_work.services;

import com.example.tp_work.entities.Enseignant;
import com.example.tp_work.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantServiceImpl implements EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    @Override
    public List<Enseignant> retrieveAllEnseignants() {
        return (List<Enseignant>) enseignantRepository.findAll();
    }

    @Override
    public Enseignant addEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public void deleteEnseignant(Long id) {
        enseignantRepository.deleteById(id);
    }

    @Override
    public Enseignant updateEnseignant(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public Enseignant retrieveEnseignant(Long id) {
        return enseignantRepository.findById(id).orElse(null);
    }
}
