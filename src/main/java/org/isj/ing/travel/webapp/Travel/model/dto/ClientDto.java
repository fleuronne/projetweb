package org.isj.ing.travel.webapp.Travel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientDto {
    private String nom;
    private String prenom;
    private  String email;
    private  String numerotelephone;
    private String numerocni;

}
