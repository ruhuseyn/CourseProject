package ur.courseproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ur.courseproject.entities.HomeEntity;

@Repository
public interface HomeRepo extends JpaRepository<HomeEntity,Long> {
}
