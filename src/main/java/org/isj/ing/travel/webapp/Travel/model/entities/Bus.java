package org.isj.ing.travel.webapp.Travel.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idbus;

    public Long getIdbus() {
        return idbus;
    }

    public void setIdbus(Long idbus) {
        this.idbus = idbus;
    }

    @Column(nullable = false)
    private String numeroBus;
    private  String categorieBus;
    private String nombrePlace;

}
