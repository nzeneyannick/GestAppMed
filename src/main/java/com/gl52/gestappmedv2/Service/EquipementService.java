package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.Equipement;
import com.gl52.gestappmedv2.Repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EquipementService {

    @Autowired
    private EquipementRepository equipementRepository;

    public List<Equipement> getAllEquipments() {
        List<Equipement>equipements = new ArrayList<>();
        equipementRepository.findAll().forEach(equipements::add);
        return equipements;
    }

    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).get();
    }


    public List<Equipement> getEquipementByName(String name) {
        return (List<Equipement>) equipementRepository.findByNameContainsOrderByLastKnowsLocation(name);
    }

    public List<Equipement> getEquipmentByLastLocation(String lastlocation) {
        return (List<Equipement>) equipementRepository.findByLastKnowsLocationOrderByName(lastlocation);
    }

    public List<Equipement> getEquipmentByEnMaintenanceIsTrue() {
        return equipementRepository.findByEnMaintenanceIsTrue();
    }

    public List<Equipement> getEquipmentByEnMaintenanceIsFalse() {
        return equipementRepository.findByEnMaintenanceIsFalse();
    }

    public List<Equipement> getEquipmentByEnPretIsTrue() {
        return equipementRepository.findByEnPretIsTrue();
    }

    public List<Equipement> getEquipmentByEnPretIsFalse() {
        return equipementRepository.findByEnPretIsFalse();
    }

    public Long saveOrUpdate(Equipement equipment) {
        return equipementRepository.save(equipment).getId();
    }

    public String deleteEquipment(Long id) {
        equipementRepository.deleteById(id);
        return "Deleted successfully id =" + id;
    }

}
