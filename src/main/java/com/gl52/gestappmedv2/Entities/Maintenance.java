package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Maintenance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Column(name = "Etat_De_Debut", columnDefinition = "enum('UNUSABLE','DEGRADED','GOOD','EXCELLENT')")
    private String etatDeDebut;
    @Column(name = "Etat_De_Fin", columnDefinition = "enum('UNUSABLE','DEGRADED','GOOD','EXCELLENT')")
    private String etatDeFin;
    private String nomTechnicien;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Equipement equipement;


}
