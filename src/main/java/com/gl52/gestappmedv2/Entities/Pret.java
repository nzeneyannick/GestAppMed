package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor


public class Pret implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date debut;
    private Date fin;
    @Column(name = "Etat_De_Debut", columnDefinition = "enum('UNUSABLE','DEGRADED','GOOD','EXCELLENT')")
    private String etatDebut;
    @Column(name = "Etat_De_Fin", columnDefinition = "enum('UNUSABLE','DEGRADED','GOOD','EXCELLENT')")
    private String etatFin;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Equipement equipement;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Client client;


}
