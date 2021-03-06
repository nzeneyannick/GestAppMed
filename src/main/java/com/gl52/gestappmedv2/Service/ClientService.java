package com.gl52.gestappmedv2.Service;

import com.gl52.gestappmedv2.Entities.Client;
import com.gl52.gestappmedv2.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClient() {
        List<Client> clients=new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).get();
    }
    public Long addClient(Client client){
        return clientRepository.save(client).getId();
    }
    public void deleteClient(Long id){
         clientRepository.deleteById(id);
    }

}
