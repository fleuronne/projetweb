package org.isj.ing.travel.webapp.Travel.repository;

import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.isj.ing.travel.webapp.Travel.model.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VoyageRepository extends JpaRepository<Voyage, Long>, JpaSpecificationExecutor<Voyage>{


        Optional<Voyage> findVoyageByVilledepart(String villedepart);

        Optional<List<Voyage>> findVoyageByVilledepartOrVillearrivee(String motcle1, String motcle2);

        boolean existsByVilledepartIgnoreCase(String villedepart);
    }

