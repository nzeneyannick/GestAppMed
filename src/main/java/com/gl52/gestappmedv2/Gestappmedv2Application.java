package com.gl52.gestappmedv2;

import com.gl52.gestappmedv2.Entities.*;
import com.gl52.gestappmedv2.Service.ClientService;
import com.gl52.gestappmedv2.Service.EquipementService;
import com.gl52.gestappmedv2.Service.TypeService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Repository;

import java.util.Locale;
import java.util.Random;

@SpringBootApplication
public class Gestappmedv2Application implements CommandLineRunner {

    @Autowired
    TypeService typeService;
    @Autowired
    EquipementService equipementService;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(Gestappmedv2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Equipement.class);
        repositoryRestConfiguration.exposeIdsFor(Client.class);
        repositoryRestConfiguration.exposeIdsFor(Maintenance.class);
        repositoryRestConfiguration.exposeIdsFor(Pret.class);
        repositoryRestConfiguration.exposeIdsFor(Type.class);

        Type type1 = new Type(1L, "type1", "P4D", null);
        Type type2 = new Type(2L, "type2", "P4D", null);
        Type type3 = new Type(3L, "type3", "P4D", null);
        Type type4 = new Type(4L, "type4", "P4D", null);

        typeService.saveOrUpdate(type1);
        typeService.saveOrUpdate(type2);
        typeService.saveOrUpdate(type3);
        typeService.saveOrUpdate(type4);

        Random rnd = new Random();


        typeService.getAllType().forEach(c -> {
            for (int i = 0; i < 10; i++) {
                Equipement equipement = new Equipement();
                equipement.setName(RandomString.make(10));
                equipement.setLastKnowsLocation(RandomString.make(10));
                equipement.setEnMaintenance(rnd.nextBoolean());
                equipement.setEnPret(rnd.nextBoolean());
                equipement.setType(c);

                equipementService.saveOrUpdate(equipement);
            }

        });


    }

}
