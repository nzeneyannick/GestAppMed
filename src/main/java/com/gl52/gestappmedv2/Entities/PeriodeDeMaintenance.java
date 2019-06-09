package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "equipements")

public class PeriodeDeMaintenance  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Column(name = "Etat_De_Debut", columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatDeDebut;
    @Column(name = "Etat_De_Fin", columnDefinition = "enum('OK','CRITIQUE','ALERTE','INCONNU','INDETERMINE')")
    private String etatDeFin;
    private String nomTechnicien;

    @OneToMany(mappedBy = "periodeDeMaintenance")
    private Set<Equipement> equipements;
    public PeriodeDeMaintenance(Date date, String etatDeDebut, String etatDeFin,String nomTechnicien,Equipement ... equipements){
        this.date = date;
        this.etatDeDebut=etatDeDebut;
        this.etatDeFin=etatDeFin;
        this.nomTechnicien=nomTechnicien;
        this.equipements= Stream.of(equipements).collect(Collectors.toSet());
        this.equipements.forEach(x->x.setPeriodeDeMaintenance(this));
    }
}
