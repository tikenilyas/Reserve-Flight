package ma.xproce.reserveflight.service;

import ma.xproce.reserveflight.dao.entities.Escal;

import java.util.List;

public interface EscalService {
    Escal saveescal(Escal escal);
    Escal updateescal(Escal escal);
    void deleteescalById(Integer id);
    void deleteAllescals();
    Escal getescalById(Integer id);
    List<Escal> getAllescals();
}
