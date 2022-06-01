package org.isj.ing.travel.webapp.Travel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isj.ing.travel.webapp.Travel.model.entities.Ville;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VoyageDto {
    private  String villedepart;
    private  String villearrivee;
    private  String heuredepart;
    private   String datedepart;
    private Ville idvilledepart;
    private  Ville idvillearrivee;

}
