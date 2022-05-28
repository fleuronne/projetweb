package org.isj.ing.travel.webapp.Travel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.isj.ing.travel.webapp.Travel.model.entities.Bus;
import org.isj.ing.travel.webapp.Travel.model.entities.Client;
import org.isj.ing.travel.webapp.Travel.model.entities.Voyage;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ReservationDto {
    private String numerochaise;
    private String siteagence;
    private String classe;
    private Client client;
    private Voyage voyage;
    private Bus bus;
}