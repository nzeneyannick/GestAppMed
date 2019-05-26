package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @RequestMapping(value = "/equipements", method = RequestMethod.GET)
    public List<Equipement> afficheListEquipement(){
       return equipementService.getAllEquipments();
    }

    @RequestMapping("/equipements{nom}")
    public List<Equipement>afficherParNom(@PathVariable("nom")String nom){
        return equipementService.getEquipementByName(nom);
    }
    @RequestMapping("/equipements/{lastlocation}")
    public List<Equipement>afficherParLocalisation(@PathVariable("lastlocation")String lastlocation){
        return equipementService.getEquipmentByLastLocation(lastlocation);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/equipements/addEquipment")
    public void addEquipement(Equipement equipement) {
        
    }

    @RequestMapping("/equipements/deletename{name}")
    public void deleteEquipementbyName(@PathVariable("name") String name) {
        equipementService.deleteEquipmentByNameEquals(name);
    }

    @RequestMapping("/equipements/deleteuuid{uuid}")
    public void deleteEquipementbyUUID(@PathVariable("uuid") UUID uuid) {
        equipementService.deleteEquipment(uuid);
    }

}
