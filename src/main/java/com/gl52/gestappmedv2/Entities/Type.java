package com.gl52.gestappmedv2.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Data

@EqualsAndHashCode(exclude = "equipements")
@Entity
@NoArgsConstructor
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //Un type comporte plusieurs equipements
    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private Set<Equipement> equipements;


    public Type(String name, Equipement... equipements) {
        this.name = name;
        this.equipements = Stream.of(equipements).collect(Collectors.toSet());
        this.equipements.forEach(x -> x.setType(this));

    }




}
