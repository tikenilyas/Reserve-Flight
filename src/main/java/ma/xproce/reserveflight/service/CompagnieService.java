package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Compagnie;

import java.util.List;

public interface CompagnieService {
    Compagnie saveaCompagnie(Compagnie Compagnie);
    Compagnie updateCompagnie(Compagnie Compagnie);
    void deleteCompagnieById(Integer id);
    void deleteAllCompagnies();
    Compagnie getCompagnieById(Integer id);
    List<Compagnie> getAllCompagnies();
}
