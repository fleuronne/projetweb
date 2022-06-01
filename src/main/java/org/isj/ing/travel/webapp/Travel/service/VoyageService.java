package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.mapper.VoyageMapper;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoyageService implements IVoyage {
    @Autowired
    VoyageRepository voyageRepository;
    @Autowired
    VoyageMapper voyageMapper;

    @Override
    public int saveVoyage(VoyageDto voyageDto) {
        return voyageRepository.save(voyageMapper.toEntity(voyageDto)).getIdvoyage().intValue();
    }

    @Override
    public VoyageDto searchVoyageVilledepart(String villedepart) {
        return voyageMapper.toDto(voyageRepository.findVoyageByVilledepart(villedepart).get());
    }

    @Override
    public List<VoyageDto> listvoyage() {
        return voyageRepository.findAll().stream()
                .map(voyageMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteVoyage(String villedepart) {

       voyageRepository.deleteById(voyageRepository.findVoyageByVilledepart(villedepart).get().getIdvoyage());
        return 1;
    }

    @Override
    public List<VoyageDto> searchVoyageByKeyword(String keyword) {

        return voyageRepository.findVoyageByVilledepartOrVillearrivee(keyword, keyword).get().stream()
                .map(voyageMapper::toDto)
                .collect(Collectors.toList());
    }
}
