package com.gl52.gestappmedv2.Entities;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "equipements")
@Entity
@NoArgsConstructor

public class Client  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<Equipement> equipements;

    public Client(String nom, String adresse, Equipement... equipements) {
        this.nom = nom;
        this.adresse = adresse;
        this.equipements = Stream.of(equipements).collect(Collectors.toSet());
        this.equipements.forEach(x -> x.setClient(this));
    }

}
