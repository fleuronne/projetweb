package org.isj.ing.travel.webapp.Travel.presentation.controller;

import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.service.IBus;
import org.isj.ing.travel.webapp.Travel.service.IVoyage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class BusController {
    @Autowired
    IBus iBus;
    IVoyage iVoyage;

    @GetMapping("/")
    public String pageAccueil(Model model) {

        return "index";
    }
    @GetMapping("/proposform")
    public String Apropos(Model model) {
        System.out.println("yes");
        return "about";
    }
    @GetMapping("/Formulaire-voyage")
    public String enregistreracte(Model model) {
        //appel de la couche service pour avoir la listes des actes
        VoyageDto voyageDto = new VoyageDto();
        //voyageDto.setNumero("CM");
        model.addAttribute("voyageDto",voyageDto);

        return "Formulaire-voyage";

    }
    @PostMapping("/formulairereservation")
    public String enregistrerActe(Model model) {
        //appel de la couche service pour avoir la listes des actes
        //BusController.log.info("enregistrer-reservation");
        return "redirect:Formulaire-reservation";}
}

