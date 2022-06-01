package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;

import java.util.List;

public interface IVille {
    int saveVille(VilleDto villeDto);

    VilleDto searchVilleNomVillearrivee(String nomvillearrivee);

    List<VilleDto> listVille();

    int deleteVille(String nomvillearrivee);

    List<VilleDto> searchvilleByKeyword(String keyword);
}
