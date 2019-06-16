package com.gl52.gestappmedv2.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
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

    private Date start;
    private Date end;
    private int startWear;
    private int endWear;

    @ManyToOne
    private Equipement equipement;

    @ManyToOne
    private Client client;
}
