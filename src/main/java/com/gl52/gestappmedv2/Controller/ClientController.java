package com.gl52.gestappmedv2.Controller;

import com.gl52.gestappmedv2.Entities.Client;
import com.gl52.gestappmedv2.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "api")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/addClient")
    public Long addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @GetMapping("/getClients")
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }

    @GetMapping("/getClient/{id}")
    public Client getClient(@PathVariable("id") Long id){
        return clientService.getClientById(id);
    }

    @DeleteMapping("/removeClient/{id}")
    public void deleteClient(Long id){
    clientService.deleteClient(id);
    }
}
