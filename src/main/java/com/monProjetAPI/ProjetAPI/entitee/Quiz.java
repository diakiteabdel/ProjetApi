package com.monProjetAPI.ProjetAPI.entitee;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "quiz")

public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> question;

    public Quiz() {
    }

    public Quiz(Integer id, String nom, Utilisateur utilisateur, List<Question> question) {
        Id = id;
        this.nom = nom;
        this.utilisateur = utilisateur;
        this.question = question;
    }
}

