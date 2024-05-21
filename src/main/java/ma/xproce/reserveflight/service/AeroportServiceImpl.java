package ma.xproce.reserveflight.service;
import ma.xproce.reserveflight.dao.repositories.AeroportR;
import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Aeroport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AeroportServiceImpl implements AeroportService {

    @Autowired
    AeroportR aeroportR1;
    @Override
    public Aeroport saveaeroport(Aeroport aeroport) {
        return aeroportR1.save(aeroport);
    }

    @Override
    public Aeroport updateaeroport(Aeroport aeroport) {
        return aeroportR1.save(aeroport);
    }

    @Override
    public void deleteaeroportById(Integer id) {
        aeroportR1.deleteById(id);

    }

    @Override
    public void deleteAllaeroports() {
        aeroportR1.deleteAll();

    }

    @Override
    public Aeroport getaeroportById(Integer id) {
        return aeroportR1.findById(id).get();
    }

    @Override
    public Page<Aeroport> getAllaeroports(int page, int taille) {
        return null;
    }

    @Override
    public Page<Aeroport> searchaeroport(String keyword, int page, int taille) {
        return aeroportR1.findAeroportByNameContains(keyword, PageRequest.of(page,taille));
    }



}
