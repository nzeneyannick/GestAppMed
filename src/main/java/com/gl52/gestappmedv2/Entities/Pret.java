package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pret implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date debut;
    private Date fin;
    @Column(name="Etat_De_Debut" ,columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatDebut;
    @Column(name="Etat_De_Fin" ,columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatFin;
    @OneToMany(mappedBy = "pret")
    private Collection<Equipement> equipements;

}
