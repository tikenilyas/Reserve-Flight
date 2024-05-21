package ma.xproce.reserveflight.service;

import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Client;
import ma.xproce.reserveflight.dao.repositories.ClientR;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{
    private ClientR clientR;
    @Override
    public Client saveclient(Client client) {
        return clientR.save(client);
    }

    @Override
    public Client updateclient(Client client) {
        return clientR.save(client);
    }

    @Override
    public void deleteclientById(Integer id) {
        clientR.deleteById(id);
    }

    @Override
    public void deleteAllclients() {
        clientR.deleteAll();
    }

    @Override
    public Client getclientById(Integer id) {
        return clientR.findById(id).get();
    }

    @Override
    public List<Client> getAllclients() {
        return clientR.findAll();
    }
}
