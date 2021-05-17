package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.MeteostationLocation;

@Repository
public interface MeteostationLocationRepository extends JpaRepository<MeteostationLocation, Integer> {
}
