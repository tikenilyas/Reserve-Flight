package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Vol;
import org.springframework.data.domain.Page;

import java.util.List;

public interface VolService {
    Vol saveVol(Vol vol);
    Vol updateVol(Vol vol);
    void deleteVolById(Integer id);
    void deleteAllVols();
    Vol getVolById(Integer id);
    Page<Vol> getAllVols(int page,int taille);
    public Page<Vol> searchVol(String keyword, int page, int taille);
}
