package com.monProjetAPI.ProjetAPI.entitee;

import jakarta.persistence.*;
@Entity
public class Question {
    private String id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Id;
    private String libelle;
    private String quiz_id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Reponse reponse;
}
