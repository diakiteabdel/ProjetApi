package com.monProjetAPI.ProjetAPI.service;

import com.monProjetAPI.ProjetAPI.entitee.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    static Utilisateur creer(Utilisateur utilisateur) {
        return null;
    }

    List<Utilisateur> lire();
    Utilisateur modifier(Utilisateur utilisateur);

    Utilisateur modifier(long id, Utilisateur utlisateur);

    static String supprimer(Long id) {
        return null;
    }


    List<Utilisateur> List();

    void supprimer(Long id);
}
