package org.isj.ing.travel.webapp.Travel.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idville;

    public Long getIdville() {

        return idville;
    }

    public void setIdville(Long idbus) {

        this.idville = idville;
    }
    @Column(nullable = false)
    private String nomvilledepart;
    private String nomvillearrivee;

}
