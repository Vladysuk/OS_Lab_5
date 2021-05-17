package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.MeteostationService;

@Repository
public interface MeteostationServiceRepository extends JpaRepository<MeteostationService, Integer> {
}
