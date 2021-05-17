package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.DataInterval;

@Repository
public interface DataIntervalRepository extends JpaRepository<DataInterval, Integer> {
}

