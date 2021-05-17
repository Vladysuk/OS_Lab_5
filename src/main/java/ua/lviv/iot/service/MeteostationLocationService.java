package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.MeteostationLocation;
import ua.lviv.iot.repository.MeteostationLocationRepository;

@Service
public class MeteostationLocationService extends BaseService<MeteostationLocation, Integer> {

    @Autowired
    MeteostationLocationRepository meteostationLocationRepository;

    @Override
    public JpaRepository<MeteostationLocation, Integer> getRepository() {
        return meteostationLocationRepository;
    }

}
