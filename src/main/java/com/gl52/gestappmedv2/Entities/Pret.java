package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "equipements")

public class Pret  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date debut;
    private Date fin;
    @Column(name = "Etat_De_Debut", columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatDebut;
    @Column(name = "Etat_De_Fin", columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatFin;
    @OneToMany(mappedBy = "pret", cascade = CascadeType.ALL)
    private Collection<Equipement> equipements;

    public Pret(Date debut, Date fin, String etatDebut, String etatFin, Equipement... equipements) {
        this.debut = debut;
        this.fin = fin;
        this.etatDebut = etatDebut;
        this.etatFin = etatFin;
        this.equipements = Stream.of(equipements).collect(Collectors.toSet());
        this.equipements.forEach(x -> x.setPret(this));
    }

}
