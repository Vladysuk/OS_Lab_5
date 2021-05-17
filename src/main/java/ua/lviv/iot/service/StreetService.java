package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Street;
import ua.lviv.iot.repository.StreetRepository;

@Service
public class StreetService extends BaseService<Street, Integer> {

    @Autowired
    StreetRepository streetRepository;

    @Override
    public JpaRepository<Street, Integer> getRepository() {
        return streetRepository;
    }

}
