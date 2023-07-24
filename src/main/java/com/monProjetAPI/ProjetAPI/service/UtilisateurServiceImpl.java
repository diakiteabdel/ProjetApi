package com.monProjetAPI.ProjetAPI.service;

import com.monProjetAPI.ProjetAPI.entitee.Utilisateur;
import com.monProjetAPI.ProjetAPI.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Demander a Spring de considérer cette class comme étant une class qui contient du code metier
@AllArgsConstructor   //Demander a Lombock de créer un constructeur avec tout les champs qui sont ici
@Getter
@Setter

public class UtilisateurServiceImpl implements UtilisateurService{

    private final UtilisateurRepository utilisateurRepository;

   // @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> lire() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur modifier(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur modifier(long id, Utilisateur utilisateur) {
        return null;
    }

    @Override
    public void supprimer(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public List<Utilisateur> List() {
        return null;
    }
}
