package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Maintenance;
import com.gl52.gestappmedv2.Service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class MaintenanceController {
    @Autowired
    MaintenanceService maintenanceService;

    @PostMapping("/addmaintenance")
    public Long addMaintenace(@RequestBody Maintenance periodeDeMaintenance) {
        return maintenanceService.savePeriodeDeMaintance(periodeDeMaintenance);
    }

    @GetMapping("/getmaintenances")
    public List<Maintenance> getAllPeriodeDeMaintenance() {
        return maintenanceService.getAllPeriodeDeMaintenace();
    }

    @GetMapping("/getmaintenance/{id}")
    public Maintenance getMaintenanceById(@PathVariable("id") Long id) {
        return maintenanceService.getPeriodeDeMaintenaceById(id);
    }

    @DeleteMapping("/removemaintance/{id}")
    public void deletePeriodeMaintenance(@PathVariable Long id){
        maintenanceService.deletePeriodeDeMaintenance(id);
    }

}
