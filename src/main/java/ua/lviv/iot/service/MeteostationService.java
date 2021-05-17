package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Meteostation;
import ua.lviv.iot.repository.MeteostationRepository;

@Service
public class MeteostationService extends BaseService<Meteostation, Integer> {

    @Autowired
    MeteostationRepository meteostationRepository;

    @Override
    public JpaRepository<Meteostation, Integer> getRepository() {
        return meteostationRepository;
    }

}
