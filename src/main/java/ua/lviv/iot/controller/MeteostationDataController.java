package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.MeteostationData;
import ua.lviv.iot.service.MeteostationDataService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/meteostation-data")
public class MeteostationDataController extends BaseController<MeteostationData, Integer> {

    @Autowired
    MeteostationDataService meteostationDataService;

    @Override
    public ServiceTemplate<MeteostationData, Integer> getService(){
        return meteostationDataService;
    }

}
