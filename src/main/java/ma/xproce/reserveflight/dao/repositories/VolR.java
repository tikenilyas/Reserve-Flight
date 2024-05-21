package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Vol;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface VolR extends JpaRepository<Vol,Integer> {
    public Page<Vol> findByJourDepartContains(String keyword, Pageable pageable);
}
