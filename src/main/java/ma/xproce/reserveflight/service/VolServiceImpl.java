package ma.xproce.reserveflight.service;

import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Vol;
import ma.xproce.reserveflight.dao.repositories.AeroportR;
import ma.xproce.reserveflight.dao.repositories.VolR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VolServiceImpl implements VolService {

    @Autowired
    VolR volR;

    @Override
    public Vol saveVol(Vol vol) {
        return volR.save(vol);
    }

    @Override
    public Vol updateVol(Vol vol) {
        return volR.save(vol);
    }

    @Override
    public void deleteVolById(Integer id) {
        volR.deleteById(id);
    }

    @Override
    public void deleteAllVols() {
        volR.deleteAll();
    }

    @Override
    public Vol getVolById(Integer id) {
        return volR.findById(id).get();
    }

    @Override
    public Page<Vol> getAllVols(int page, int taille) {
     return volR.findAll(PageRequest.of(page,taille));
    }

    @Override
    public Page<Vol> searchVol(String keyword, int page, int taille) {
        return volR.findByJourDepartContains(keyword,PageRequest.of(page,taille));
    }


}
