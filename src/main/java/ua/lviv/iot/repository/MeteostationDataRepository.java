package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.MeteostationData;

@Repository
public interface MeteostationDataRepository extends JpaRepository<MeteostationData, Integer> {
}
