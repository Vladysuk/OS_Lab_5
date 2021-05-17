package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.MeteostationManufacturer;
import ua.lviv.iot.repository.MeteostationManufacturerRepository;

@Service
public class MeteostationManufacturerService extends BaseService<MeteostationManufacturer, Integer> {

    @Autowired
    MeteostationManufacturerRepository meteostationManufacturerRepository;

    @Override
    public JpaRepository<MeteostationManufacturer, Integer> getRepository() {
        return meteostationManufacturerRepository;
    }

}
