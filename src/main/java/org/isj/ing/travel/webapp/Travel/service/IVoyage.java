package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;

import java.util.List;

public interface IVoyage {

    int saveVoyage(VoyageDto voyageDto);

    VoyageDto searchVoyageVilledepart(String villedepart);

    List<VoyageDto> listvoyage();

    int deleteVoyage(String villedepart);

    List<VoyageDto> searchVoyageByKeyword(String keyword);
}
