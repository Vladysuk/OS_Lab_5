package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.WindDirection;

@Repository
public interface WindDirectionRepository extends JpaRepository<WindDirection, Integer> {
}
