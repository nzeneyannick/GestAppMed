package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @PostMapping("/equipments")
    public Long save(@RequestBody Equipement equipement) {
        return equipementService.saveOrUpdate(equipement);
    }

    @GetMapping("/equipments")
    public List<Equipement> getAllEquipments() {
        return equipementService.getAllEquipments();
    }

    @GetMapping("/equipments{id}")
    public Equipement getEquipmentById(@PathVariable("id") Long id) {
        return equipementService.getEquipementById(id);
    }

    @GetMapping("/equipments{nom}")
    public List<Equipement> getEquipmentsByName(@PathVariable("nom") String nom) {
        return equipementService.getEquipementByName(nom);
    }

    //Spect http à confirmer
    @GetMapping("/equipements/{lastlocation}")
    public List<Equipement> getEquipmentByLocation(@PathVariable("lastlocation") String lastlocation) {
        return equipementService.getEquipmentByLastLocation(lastlocation);
    }

    //Spect http à confirmer
    @GetMapping("/equipements/maintenanceEnCour")
    public List<Equipement> getEquipmentByEnMaintenanceIsTrue() {
        return equipementService.getEquipmentByEnMaintenanceIsTrue();
    }
    //Spect http à confirmer
    @GetMapping("/equipements/maintenanceArrete")
    public List<Equipement> getEquipmentByEnMaintenanceIsFalse() {
        return equipementService.getEquipmentByEnMaintenanceIsFalse();
    }
    //Spect http à confirmer
    @GetMapping("/equipements/enpret")
    public List<Equipement> getEquipmentByEnPretIsTrue() {
        return equipementService.getEquipmentByEnPretIsTrue();
    }
    //Spect http à confirmer equipement non prêté
    @GetMapping("/equipements/disponible")
    public List<Equipement> getEquipmentByEnPretIsFalse() {
        return equipementService.getEquipmentByEnPretIsFalse();
    }



    @DeleteMapping(value = "/equipments{id}")
    public void deleteEquipement(@PathVariable("id") Long id) {
        equipementService.deleteEquipment(id);
    }

}
