package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


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

    //Cardinalité Equipement-Type
    @ManyToOne
    private Type type;

    //cardinalité Equipement-Pret
    @OneToMany(mappedBy = "equipement")
    Collection<Pret> prets;

    //cardinalité Equipement-Maintenance
    @OneToMany(mappedBy = "equipement")
    Collection<Maintenance> maintenances;


}


