package com.monProjetAPI.ProjetAPI.entitee;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor  @AllArgsConstructor
@Entity

@Table(name = "utilisateur")


public class Utilisateur {


    public Object get;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=50)
    private String nom;

    @Column(length=50)
    private String prenom;

    @Column(length=50)
    private String username;

    @Column(length=150)
    private String password;

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<Quiz> quiz;


}
