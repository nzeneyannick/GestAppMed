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
        return (List<Equipement>) equipementRepository.findAll();
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

    public Equipement saveOrUpdate(Equipement equipment) {
        return equipementRepository.save(equipment);
    }

    public String deleteEquipment(Long id) {
        equipementRepository.deleteById(id);
        return "Deleted successfully id =" + id;
    }

}
