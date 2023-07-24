package com.monProjetAPI.ProjetAPI.repository;

import com.monProjetAPI.ProjetAPI.entitee.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
  Utilisateur save (Utilisateur utilisateur);

    List<Utilisateur> findAll();

  Optional<Utilisateur> findById(Long id);
}
