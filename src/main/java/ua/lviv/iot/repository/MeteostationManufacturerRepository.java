package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.MeteostationManufacturer;

@Repository
public interface MeteostationManufacturerRepository extends JpaRepository<MeteostationManufacturer, Integer> {
}
