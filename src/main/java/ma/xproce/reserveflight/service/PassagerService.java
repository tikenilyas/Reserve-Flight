package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Passager;
import ma.xproce.reserveflight.dao.entities.Vol;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PassagerService {
    Passager savePassager(Passager passager);
    Passager updatePassager(Passager passager);
    void deletePassagerById(Integer id);
    void deleteAllPassagers();
    Passager getPassagerById(Integer id);
    Page<Passager> getAllPassagers(int page, int taille);
    public Page<Passager> searchPassager(String keyword, int page, int taille);
}
