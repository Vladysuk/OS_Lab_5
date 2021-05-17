package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.MeteostationData;
import ua.lviv.iot.repository.MeteostationDataRepository;

@Service
public class MeteostationDataService extends BaseService<MeteostationData, Integer> {

    @Autowired
    MeteostationDataRepository meteostationDataRepository;

    @Override
    public JpaRepository<MeteostationData, Integer> getRepository() {
        return meteostationDataRepository;
    }

}
