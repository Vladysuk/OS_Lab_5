package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.MeteostationService;
import ua.lviv.iot.service.MeteostationServiceService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/meteostation-service")
public class MeteostationServiceController extends BaseController<MeteostationService, Integer> {

    @Autowired
    MeteostationServiceService meteostationServiceService;

    @Override
    public ServiceTemplate<MeteostationService, Integer> getService(){
        return meteostationServiceService;
    }

}
