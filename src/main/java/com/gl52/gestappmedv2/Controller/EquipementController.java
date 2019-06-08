package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @PostMapping("/save")
    public Equipement save(@RequestBody Equipement equipement){
        return equipementService.saveOrUpdate(equipement);
    }

    @GetMapping("/listEquipements")
  public List<Equipement> listEquipement(){
        return  equipementService.getAllEquipments();
    }

    //@GetMapping("/equipements{id}")
   // public Equipement getById(@PathVariable("id") Long id){
      //  return equipementService.getEquipmentById(id);
    //}

    @GetMapping("/equipements{nom}")
    public List<Equipement>afficherParNom(@PathVariable("nom")String nom){
        return equipementService.getEquipementByName(nom);
    }

    @GetMapping("/equipements/{lastlocation}")
    public List<Equipement>afficherParLocalisation(@PathVariable("lastlocation")String lastlocation){
        return equipementService.getEquipmentByLastLocation(lastlocation);
    }

    @DeleteMapping(value ="/equipements/deleteid{id}")
    public void deleteEquipement(@PathVariable("id") Long id) {
        equipementService.deleteEquipment(id);
    }

}
