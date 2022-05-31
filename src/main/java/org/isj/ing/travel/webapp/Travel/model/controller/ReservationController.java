package org.isj.ing.travel.webapp.Travel.model.controller;

import com.sun.tools.javac.util.DefinedBy.Api;
import lombok.extern.slf4j.Slf4j;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.service.ReservationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/reservation")
@RestController
@Slf4j
@Api("reservation")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ReservationDto reservationDto) {
        reservationService.save(reservationDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDto> findById(@PathVariable("id") Long id) {
        ReservationDto reservation = reservationService.findById(id);
        return ResponseEntity.ok(reservation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        Optional.ofNullable(reservationService.findById(id)).orElseThrow(() -> {
            log.error("Unable to delete non-existent data！");
            return new ResourceNotFoundException();
        });
        reservationService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/page-query")
    public ResponseEntity<Page<ReservationDto>> pageQuery(ReservationDto reservationDto, @PageableDefault(sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<ReservationDto> reservationPage = reservationService.findByCondition(reservationDto, pageable);
        return ResponseEntity.ok(reservationPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ReservationDto reservationDto, @PathVariable("id") Long id) {
        reservationService.update(reservationDto, id);
        return ResponseEntity.ok().build();
    }
}