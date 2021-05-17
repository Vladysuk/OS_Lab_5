package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.MeteostationLocation;
import ua.lviv.iot.service.MeteostationLocationService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/meteostation-location")
public class MeteostationLocationController extends BaseController<MeteostationLocation, Integer> {

    @Autowired
    MeteostationLocationService meteostationLocationService;

    @Override
    public ServiceTemplate<MeteostationLocation, Integer> getService(){
        return meteostationLocationService;
    }

}
