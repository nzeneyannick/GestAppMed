package com.gl52.gestappmedv2.Entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;

    //Cardinalité Client-Pret
    @OneToMany(mappedBy = "pret")
    Collection<Pret> prets;


}
