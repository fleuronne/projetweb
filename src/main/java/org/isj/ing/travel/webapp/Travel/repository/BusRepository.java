package org.isj.ing.travel.webapp.Travel.repository;

import org.isj.ing.travel.webapp.Travel.model.entities.Bus;
import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BusRepository extends JpaRepository<Bus, Long>, JpaSpecificationExecutor<Bus>{

        Optional<Bus> findBusByNumeroBus(String numeroBus);

        Optional<List<Bus>> findBusByNumeroBusOrNombrePlace(String motcle1, String motcle2);

        boolean existsByNumeroBusIgnoreCase(String numeroBus);
    }

