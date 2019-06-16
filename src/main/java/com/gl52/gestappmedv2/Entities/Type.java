package com.gl52.gestappmedv2.Entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String maintenanceInterval;

    @OneToMany(mappedBy = "type", cascade = CascadeType.REMOVE)
    private Collection<Equipement> equipements;
}
