package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.ManufacturerAddress;

@Repository
public interface ManufacturerAddressRepository extends JpaRepository<ManufacturerAddress, Integer> {
}
