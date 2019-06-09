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

public class PeriodeDeMaintenance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Enum etatDeDebut;
    private Enum etatDeFin;
    private String nomTechnicien;

    @OneToMany(mappedBy = "periodeDeMaintenance")
    private Collection<Equipement> equipements;
}
