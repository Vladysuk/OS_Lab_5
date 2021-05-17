package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Meteostation;

@Repository
public interface MeteostationRepository extends JpaRepository<Meteostation, Integer> {
}
