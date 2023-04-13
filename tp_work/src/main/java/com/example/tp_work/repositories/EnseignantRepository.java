package com.example.tp_work.repositories;

import com.example.tp_work.entities.Enseignant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantRepository extends CrudRepository<Enseignant, Long> {}
