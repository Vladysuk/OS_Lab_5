package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.MeteostationService;
import ua.lviv.iot.repository.MeteostationServiceRepository;

@Service
public class MeteostationServiceService extends BaseService<MeteostationService, Integer> {

    @Autowired
    MeteostationServiceRepository meteostationServiceRepository;

    @Override
    public JpaRepository<MeteostationService, Integer> getRepository() {
        return meteostationServiceRepository;
    }

}
