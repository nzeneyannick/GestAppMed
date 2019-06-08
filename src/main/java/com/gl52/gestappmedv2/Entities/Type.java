package com.gl52.gestappmedv2.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //Un type comporte plusieurs equipements
    @OneToMany(mappedBy = "type")
    private Collection<Equipement> equipements;
    /*
    public String toString() {
        System.out.println("Type =>" + "Id :"+  getName() +"Name :"+getName());
        for (Equipement e:equipements){
            e.toString();
        }
    }*/


}
