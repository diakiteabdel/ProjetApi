package com.monProjetAPI.ProjetAPI.entitee;

import com.monProjetAPI.ProjetAPI.enums.type_reponse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String libelle;
    private String quiz_id;
    //@Enumerated(EnumType.String)
    private type_reponse type;
}
