package org.isj.ing.travel.webapp.Travel.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idreservation;

    public Long getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(Long idreservation) {
        this.idreservation = idreservation;
    }

    @Column( nullable = false)


    private String numerochaise;
    private String siteagence;
    private String classe;
    @ManyToOne
    @JoinColumn(name = "client_idclient")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "voyage_idvoyage")
    private Voyage voyage;
}
