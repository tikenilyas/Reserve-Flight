package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Compagnie;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface CompagnieR extends JpaRepository<Compagnie,Integer> {
}
