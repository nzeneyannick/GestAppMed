package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.Maintenance;
import com.gl52.gestappmedv2.Repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MaintenanceService {
    @Autowired
    MaintenanceRepository maintenanceRepository;

    public List<Maintenance> getAllPeriodeDeMaintenace() {
        return maintenanceRepository.findAll();
    }

    public Maintenance getPeriodeDeMaintenaceById(Long id) {
        return maintenanceRepository.findById(id).get();
    }

    public Long savePeriodeDeMaintance(Maintenance periodeDeMaintenance) {
        return maintenanceRepository.save(periodeDeMaintenance).getId();
    }

    public void deletePeriodeDeMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
