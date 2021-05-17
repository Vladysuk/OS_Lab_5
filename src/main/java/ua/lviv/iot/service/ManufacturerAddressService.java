package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.ManufacturerAddress;
import ua.lviv.iot.repository.ManufacturerAddressRepository;

@Service
public class ManufacturerAddressService extends BaseService<ManufacturerAddress, Integer> {

    @Autowired
    ManufacturerAddressRepository manufacturerAddressRepository;

    @Override
    public JpaRepository<ManufacturerAddress, Integer> getRepository() {
        return manufacturerAddressRepository;
    }

}
