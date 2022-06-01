package org.isj.ing.travel.webapp.Travel.presentation.api;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.service.IReservation;
import org.isj.ing.travel.webapp.Travel.service.IVille;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class VilleRestController {
    @Autowired
    private IVille iVille;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody VilleDto create ) {
        //ReservationRestController.log.info("enregistrer-revervation");

    }

    @GetMapping("/{nomvillearrivee}/data")
    public ResponseEntity<VilleDto> getActeByActe(@PathVariable String nomvillearrivee){

        return ResponseEntity.ok(iVille.searchVilleNomVillearrivee(nomvillearrivee));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VilleDto>> getAllVille() {
        return ResponseEntity.ok(iVille.listVille());
    }

    @GetMapping("/{numerochaise}/delete")

    public int deteleVille(@PathVariable String nomvillearrivee){
        return iVille.deleteVille(nomvillearrivee);
    }
}
