package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Equipement  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastKnowsLocation;
    private Boolean enMaintenance;
    private Boolean enPret;
    @JoinColumn
    @ManyToOne
    private Type type;
    @JoinColumn
    @ManyToOne
    private PeriodeDeMaintenance periodeDeMaintenance;// = new PeriodeDeMaintenance(null,null,null,null);
    @JoinColumn
    @ManyToOne
    private Pret pret;
    @JoinColumn
    @ManyToOne
    private Client client;

    public Equipement(String name, String lastKnowsLocation, Boolean enMaintenance, Boolean enPret, Type type, PeriodeDeMaintenance periodeDeMaintenance, Pret pret, Client client) {
        this.name = name;
        this.lastKnowsLocation = lastKnowsLocation;
        this.enMaintenance = enMaintenance;
        this.enPret = enPret;
        this.type = type;
        this.periodeDeMaintenance = periodeDeMaintenance;
        this.pret = pret;
        this.client = client;
    }
}


