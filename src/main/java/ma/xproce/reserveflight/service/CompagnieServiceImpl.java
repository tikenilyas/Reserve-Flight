package ma.xproce.reserveflight.service;
import ma.xproce.reserveflight.dao.repositories.CompagnieR;
import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Compagnie;
import ma.xproce.reserveflight.dao.repositories.CompagnieR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CompagnieServiceImpl implements CompagnieService{
    @Autowired
    CompagnieR compagnieR1;
    @Override
    public Compagnie saveaCompagnie(Compagnie compagnie) {
        return compagnieR1.save(compagnie);
    }

    @Override
    public Compagnie updateCompagnie(Compagnie compagnie) {
        return compagnieR1.save(compagnie);
    }

    @Override
    public void deleteCompagnieById(Integer id) {
        compagnieR1.deleteById(id);

    }

    @Override
    public void deleteAllCompagnies() {
        compagnieR1.deleteAll();
    }

    @Override
    public Compagnie getCompagnieById(Integer id) {
        return compagnieR1.findById(id).get();
    }

    @Override
    public List<Compagnie> getAllCompagnies() {
        return compagnieR1.findAll();
    }
}
