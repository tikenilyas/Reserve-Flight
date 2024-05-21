package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Vol;
import org.springframework.data.domain.Page;

import java.util.List;

    public interface AeroportService {
    Aeroport saveaeroport(Aeroport aeroport);
    Aeroport updateaeroport(Aeroport aeroport);
    void deleteaeroportById(Integer id);
    void deleteAllaeroports();
    Aeroport getaeroportById(Integer id);
    Page<Aeroport> getAllaeroports(int page,int taille);
     Page<Aeroport> searchaeroport(String keyword, int page, int taille);
}
