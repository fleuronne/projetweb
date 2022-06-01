package org.isj.ing.travel.webapp.Travel.presentation.api;

import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.service.IReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/reservation")
@RestController
@Slf4j


public class ReservationRestController {

    @Autowired
    private IReservation iReservation;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody ReservationDto create ) {
        //ReservationRestController.log.info("enregistrer-revervation");

    }

    @GetMapping("/{numero}/data")
    public ResponseEntity<ReservationDto> getActeByActe(@PathVariable String numerochaise){

        return ResponseEntity.ok(iReservation.searchReservationNumero(numerochaise));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReservationDto>> getAllReservation() {
        return ResponseEntity.ok(iReservation.listreservation());
    }

    @GetMapping("/{numerochaise}/delete")

    public int deteleReservation(@PathVariable String numerochaise){
        return iReservation.deleteReservation(numerochaise);
    }
}