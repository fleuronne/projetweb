package org.isj.ing.travel.webapp.Travel.presentation.api;


import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.service.IClient;
import org.isj.ing.travel.webapp.Travel.service.IReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/Client")
@RestController
@Slf4j
public class ClientRestController {
    @Autowired
    private IClient iClient;

    @PostMapping(value = "/save")
    public void enregistrer (@RequestBody ClientDto create ) {
        //ReservationRestController.log.info("enregistrer-revervation");

    }

    @GetMapping("/{numerocni}/data")
    public ResponseEntity<ClientDto> getActeByActe(@PathVariable String numerocni){

        return ResponseEntity.ok(iClient.searchClientNumerocni(numerocni));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClientDto>> getAllClient() {
        return ResponseEntity.ok(iClient.listclient());
    }

    @GetMapping("/{numerocni}/delete")

    public int deteleClient(@PathVariable String numerocni){
        return iClient.deleteClient(numerocni);
    }
}
