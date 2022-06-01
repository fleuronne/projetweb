package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.mapper.ReservationMapper;
import org.isj.ing.travel.webapp.Travel.mapper.VilleMapper;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.repository.ReservationRepository;
import org.isj.ing.travel.webapp.Travel.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VilleService implements IVille{

    @Autowired
    VilleRepository villeRepository;
    @Autowired
    VilleMapper villeMapper;
    @Override
    public int saveVille(VilleDto villeDto) {
        return villeRepository.save(villeMapper.toEntity(villeDto)).getIdville().intValue();
    }

    @Override
    public VilleDto searchVilleNomVillearrivee(String nomvillearrivee) {
        return villeMapper.toDto(villeRepository.findVilleByNomvillearrivee(nomvillearrivee).get());
    }

    @Override
    public List<VilleDto> listVille() {
        return villeRepository.findAll().stream()
                .map(villeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteVille(String nomvillearrivee) {
        villeRepository.deleteById(villeRepository.findVilleByNomvillearrivee(nomvillearrivee).get().getIdville());
        return 1;
    }

    @Override
    public List<VilleDto> searchvilleByKeyword(String keyword) {
        return villeRepository.findVilleByNomvillearriveeOrNomvilledepart(keyword, keyword).get().stream()
                .map(villeMapper::toDto)
                .collect(Collectors.toList());
    }
}
