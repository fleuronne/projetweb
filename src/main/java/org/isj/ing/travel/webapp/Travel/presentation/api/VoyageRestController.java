package org.isj.ing.travel.webapp.Travel.presentation.api;

import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.service.IReservation;
import org.isj.ing.travel.webapp.Travel.service.IVoyage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/voyage")
@RestController
@Slf4j
public class VoyageRestController {

    @Autowired
    private IVoyage iVoyage;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody VoyageDto create ) {
        //VoyageRestController.log.info("enregistrer_voyage");

    }
    @GetMapping("/{villedepart}/data")
    public ResponseEntity<VoyageDto> getVoyageByVoyage(@PathVariable String villedepart){

        return ResponseEntity.ok(iVoyage.searchVoyageVilledepart(villedepart));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VoyageDto>> getAllVoyage() {

        return ResponseEntity.ok(iVoyage.listvoyage());
    }

    @GetMapping("/{villedepart}/delete")

    public int deteleVoyage(@PathVariable String villedepart){

        return iVoyage.deleteVoyage(villedepart);
    }

}
