package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.repository.CityRepository;

@Service
public class CityService extends BaseService<City, Integer> {

    @Autowired
    CityRepository cityRepository;

    @Override
    public JpaRepository<City, Integer> getRepository() {
        return cityRepository;
    }

}

