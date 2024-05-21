package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Aeroport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface AeroportR extends JpaRepository<Aeroport,Integer> {
public Page<Aeroport> findAeroportByNameContains(String keyword, Pageable pageable);
}
