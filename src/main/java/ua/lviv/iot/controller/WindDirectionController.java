package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.WindDirection;
import ua.lviv.iot.service.ServiceTemplate;
import ua.lviv.iot.service.WindDirectionService;

@RestController
@RequestMapping("/wind-direction")
public class WindDirectionController extends BaseController<WindDirection, Integer> {

    @Autowired
    WindDirectionService windDirectionService;

    @Override
    public ServiceTemplate<WindDirection, Integer> getService(){
        return windDirectionService;
    }

}
