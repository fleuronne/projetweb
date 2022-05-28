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
    private long idBus;
    @Column(nullable = false)
    private String numeroBus;
    private  String categorieBus;
    private String nombrePlace;

}
