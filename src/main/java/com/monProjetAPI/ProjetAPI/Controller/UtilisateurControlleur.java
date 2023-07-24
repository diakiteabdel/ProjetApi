package com.monProjetAPI.ProjetAPI.Controller;

import com.monProjetAPI.ProjetAPI.entitee.Utilisateur;
import com.monProjetAPI.ProjetAPI.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
@AllArgsConstructor

public class UtilisateurControlleur {
    private final UtilisateurService utilisateurService;

    @PostMapping("/create")
    public Utilisateur create(@RequestBody Utilisateur utilisateur){

        return UtilisateurService.creer(utilisateur);
    }

    @GetMapping("/read")
    public List<Utilisateur> read(){
        return utilisateurService.List();
    }

    @PutMapping("/modifier/{id}")
    public Utilisateur update(@PathVariable long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.modifier(id, utilisateur);
    }

    @PutMapping("/delete")
    public String delete (@PathVariable Long id){

        return UtilisateurService.supprimer(id);
    }

}
