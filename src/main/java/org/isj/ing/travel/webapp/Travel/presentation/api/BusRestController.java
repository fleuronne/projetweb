package org.isj.ing.travel.webapp.Travel.presentation.api;

import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.service.IBus;
import org.isj.ing.travel.webapp.Travel.service.IVoyage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/voyage")
@RestController
@Slf4j
public class BusRestController {
    @Autowired
    private IBus iBus;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody BusDto create ) {
        //VoyageRestController.log.info("enregistrer_voyage");

    }
    @GetMapping("/{numeroBus}/data")
    public ResponseEntity<BusDto> getBusByBus(@PathVariable String numeroBus){

        return ResponseEntity.ok(iBus.searchBusNumero(numeroBus));
    }

    @GetMapping("/all")
    public ResponseEntity<List<BusDto>> getAllBus() {
        return ResponseEntity.ok(iBus.listbus());
    }

    @GetMapping("/{villedepart}/delete")

    public int deteleBus(@PathVariable String numeroBus){
        return iBus.deleteBus(numeroBus);
    }
}
