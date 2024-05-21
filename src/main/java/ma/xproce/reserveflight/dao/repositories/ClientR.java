package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface ClientR extends JpaRepository<Client,Integer> {
}
