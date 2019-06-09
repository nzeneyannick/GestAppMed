package com.gl52.gestappmedv2.Repository;

import com.gl52.gestappmedv2.Entities.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository  extends CrudRepository<Client, Long> {
    public List<Client> findAll();
    public Optional<Client> findById(Long id);
    public Client save(Client client);
    public void deleteById(Long id);
}
