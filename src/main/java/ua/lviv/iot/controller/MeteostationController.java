package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Meteostation;
import ua.lviv.iot.service.MeteostationService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/meteostation")
public class MeteostationController extends BaseController<Meteostation, Integer> {

    @Autowired
    MeteostationService meteostationService;

    @Override
    public ServiceTemplate<Meteostation, Integer> getService(){
        return meteostationService;
    }

}
