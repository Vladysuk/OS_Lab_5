package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.MeteostationManufacturer;
import ua.lviv.iot.service.MeteostationManufacturerService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/meteostation-manufacturer")
public class MeteostationManufacturerController extends BaseController<MeteostationManufacturer, Integer> {

    @Autowired
    MeteostationManufacturerService meteostationManufacturerService;

    @Override
    public ServiceTemplate<MeteostationManufacturer, Integer> getService(){
        return meteostationManufacturerService;
    }

}
