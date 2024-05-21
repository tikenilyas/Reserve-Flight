package ma.xproce.reserveflight.service;

import lombok.AllArgsConstructor;
import ma.xproce.reserveflight.dao.entities.Escal;
import ma.xproce.reserveflight.dao.repositories.EscalR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EscalServiceImpl implements EscalService {

    @Autowired
    EscalR escalR1;


    @Override
    public Escal saveescal(Escal escal) {
        return escalR1.save(escal);
    }

    @Override
    public Escal updateescal(Escal escal) {
        return escalR1.save(escal);
    }

    @Override
    public void deleteescalById(Integer id) {
        escalR1.deleteById(id);

    }

    @Override
    public void deleteAllescals() {
        escalR1.deleteAll();

    }

    @Override
    public Escal getescalById(Integer id) {
        return escalR1.getById(id);
    }

    @Override
    public List<Escal> getAllescals() {
        return escalR1.findAll();
    }
}
