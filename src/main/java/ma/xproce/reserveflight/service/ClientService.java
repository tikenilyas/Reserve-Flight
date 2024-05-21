package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Client;

import java.util.List;

public interface ClientService {
   Client saveclient(Client client);
   Client updateclient(Client client);
   void deleteclientById(Integer id);
   void deleteAllclients();
   Client getclientById(Integer id);
   List<Client> getAllclients();
}
