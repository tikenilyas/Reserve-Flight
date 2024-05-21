package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Escal;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface EscalR extends JpaRepository<Escal,Integer> {
}
