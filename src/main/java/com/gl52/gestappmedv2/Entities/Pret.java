package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fin;
    private EtatDebut etatDebut;
    private EtatFin etatFin;
    @OneToMany(mappedBy = "pret")
    private Collection<Equipement> equipements;

}
