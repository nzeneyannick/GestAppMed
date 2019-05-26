package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public  class EquipementService  {

    @Autowired
    private EquipementRepository equipementRepository;

    public List<Equipement>  getAllEquipments(){
        List<Equipement> listEquipement = new ArrayList<>();
        equipementRepository.findAll().forEach(listEquipement::add);
        return listEquipement;
    }

    public List<Equipement> getEquipementByName(String name) {
        return equipementRepository.findByNameContainsOrderByName(name);
    }
    public List<Equipement> getEquipmentByLastLocation(String lastlocation) {
        return equipementRepository.findEquipementsByLastKnowsLocationContainingOrderByLastKnowsLocation(lastlocation);
    }

    public void addEquipment(Equipement equipment) {
        equipementRepository.save(equipment);
    }

    public void deleteEquipment(UUID uuid) {
        equipementRepository.deleteEquipementByUuidEquals(uuid);
    }
    public void deleteEquipmentByNameEquals(String name){
        equipementRepository.deleteEquipementByNameEquals(name);
    };
}
