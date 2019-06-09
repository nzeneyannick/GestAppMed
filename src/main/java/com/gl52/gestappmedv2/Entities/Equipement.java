package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Equipement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastKnowsLocation;
    private Boolean enMaintenance;
    private Boolean enPret;
    @ManyToOne
    private Type type;
    @ManyToOne
    private PeriodeDeMaintenance periodeDeMaintenance;
    @ManyToOne
    private Pret pret;
    @ManyToOne
    private Client client;


}


