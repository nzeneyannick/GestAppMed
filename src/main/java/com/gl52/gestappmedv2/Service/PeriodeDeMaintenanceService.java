package com.gl52.gestappmedv2.Service;


import com.gl52.gestappmedv2.Entities.Maintenance;
import com.gl52.gestappmedv2.Repository.PeriodeDeMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PeriodeDeMaintenanceService {
    @Autowired
    PeriodeDeMaintenanceRepository periodeDeMaintenanceRepository;

    public List<Maintenance> getAllPeriodeDeMaintenace() {
        return periodeDeMaintenanceRepository.findAll();
    }

    public Maintenance getPeriodeDeMaintenaceById(Long id) {
        return periodeDeMaintenanceRepository.findById(id).get();
    }

    public Long savePeriodeDeMaintance(Maintenance periodeDeMaintenance) {
        return periodeDeMaintenanceRepository.save(periodeDeMaintenance).getId();
    }

    public void deletePeriodeDeMaintenance(Long id) {
        periodeDeMaintenanceRepository.deleteById(id);
    }
}
