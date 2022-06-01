package org.isj.ing.travel.webapp.Travel.repository;

import org.isj.ing.travel.webapp.Travel.model.entities.Ville;
import org.isj.ing.travel.webapp.Travel.model.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VilleRepository  extends JpaRepository<Ville, Long>, JpaSpecificationExecutor<Ville>{

        Optional<Ville> findVilleByNomvillearrivee(String nomvillearrivee);

        Optional<List<Ville>> findVilleByNomvillearriveeOrNomvilledepart(String motcle1, String motcle2);

        boolean existsByNomvillearriveeIgnoreCase(String nomvillearrivee);
}
