package ma.xproce.reserveflight.service;

import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Passager;
import ma.xproce.reserveflight.dao.repositories.AeroportR;
import ma.xproce.reserveflight.dao.repositories.PassagerR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PassagerServiceImpl implements PassagerService {

    @Autowired
    PassagerR passagerR1;

    @Override
    public Passager savePassager(Passager passager) {
        return passagerR1.save(passager);
    }

    @Override
    public Passager updatePassager(Passager passager) {
        return passagerR1.save(passager);
    }

    @Override
    public void deletePassagerById(Integer id) {
        passagerR1.deleteById(id);
    }

    @Override
    public void deleteAllPassagers() {
        passagerR1.deleteAll();
    }

    @Override
    public Passager getPassagerById(Integer id) {
        return passagerR1.findById(id).get();
    }

    @Override
    public Page<Passager> getAllPassagers(int page, int taille) {
        return null;
    }

    @Override
    public Page<Passager> searchPassager(String keyword, int page, int taille) {
        return passagerR1.findPassagerByNameContains(keyword,PageRequest.of(page,taille));
    }


}
