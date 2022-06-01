package org.isj.ing.travel.webapp.Travel.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idvoyage;

    public Long getIdvoyage() {
        return idvoyage;
    }

    public void setIdvoyage(Long idvoyage) {
        this.idvoyage = idvoyage;
    }

    @Column(nullable = false)
    private  String villedepart;
    private  String villearrivee;
    private  String heuredepart;
    private String datedepart;
    @ManyToOne
    @JoinColumn(name = "idvilledepart_idville")
    private Ville idvilledepart;
    @ManyToOne
    @JoinColumn(name = "idvillearrivee_idville")
    private  Ville idvillearrivee;
    @ManyToOne
    @JoinColumn(name = "bus_id_bus")
    private Bus bus;
}
