package ma.xproce.reserveflight.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.reserveflight.dao.entities.Passager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface PassagerR extends JpaRepository<Passager,Integer> {
    public Page<Passager> findPassagerByNameContains(String keyword, Pageable pageable);
}
