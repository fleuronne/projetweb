package org.isj.ing.travel.webapp.Travel.repository;

import org.isj.ing.travel.webapp.Travel.model.entities.Client;
import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>, JpaSpecificationExecutor<Client>{

        Optional<Client> findClientByNumerocni(String numerocni);

        Optional<List<Client>> findClientByNumerocniOrNumerotelephone(String motcle1, String motcle2);

        boolean existsByNumerocniIgnoreCase(String numerocni);
    }

