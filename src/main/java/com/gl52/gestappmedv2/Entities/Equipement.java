package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Type type;

    //cardinalité Equipement-Pret
    @OneToMany(mappedBy = "equipement")
    Collection<Pret> prets;

    //cardinalité Equipement-Maintenance
    @OneToMany(mappedBy = "equipement")
    Collection<Maintenance> maintenances;


}


