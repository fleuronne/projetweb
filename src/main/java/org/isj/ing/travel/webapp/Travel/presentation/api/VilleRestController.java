package org.isj.ing.travel.webapp.Travel.presentation.api;

import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.service.IReservation;
import org.isj.ing.travel.webapp.Travel.service.IVille;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/ville")
@RestController
@Slf4j

public class VilleRestController {
    @Autowired
    private IVille iVille;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody VilleDto create ) {
        //ReservationRestController.log.info("enregistrer-revervation");
        iVille.saveVille(create);

    }

    @GetMapping("/{nomvillearrivee}/data")
    public ResponseEntity<VilleDto> getActeByActe(@PathVariable String nomvillearrivee){

        return ResponseEntity.ok(iVille.searchVilleNomVillearrivee(nomvillearrivee));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VilleDto>> getAllVille() {
        return ResponseEntity.ok(iVille.listVille());
    }

    @GetMapping("/{nomvillearrivee}/delete")

    public int deteleVille(@PathVariable String nomvillearrivee){
        return iVille.deleteVille(nomvillearrivee);
    }
}
