package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.ManufacturerAddress;
import ua.lviv.iot.service.ManufacturerAddressService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/manufacturer-address")
public class ManufacturerAddressController extends BaseController<ManufacturerAddress, Integer> {

    @Autowired
    ManufacturerAddressService manufacturerAddressService;

    @Override
    public ServiceTemplate<ManufacturerAddress, Integer> getService(){
        return manufacturerAddressService;
    }

}
