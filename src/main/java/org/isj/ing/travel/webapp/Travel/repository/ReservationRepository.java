package org.isj.ing.travel.webapp.Travel.repository;

import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>, JpaSpecificationExecutor<Reservation> {

    Optional<Reservation> findReservationByNumerochaise(String numerochaise);

    Optional<List<Reservation>> findReservationByNumerochaiseOrClasse(String motcle1, String motcle2);

    boolean existsByNumerochaiseIgnoreCase(String numerochaise);
}