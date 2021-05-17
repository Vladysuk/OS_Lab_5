package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.WindDirection;
import ua.lviv.iot.repository.WindDirectionRepository;

@Service
public class WindDirectionService extends BaseService<WindDirection, Integer> {

    @Autowired
    WindDirectionRepository windDirectionRepository;

    @Override
    public JpaRepository<WindDirection, Integer> getRepository() {
        return windDirectionRepository;
    }

}
