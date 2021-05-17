package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.service.CityService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/city")
public class CityController extends BaseController<City, Integer> {

    @Autowired
    CityService cityService;

    @Override
    public ServiceTemplate<City, Integer> getService(){
        return cityService;
    }

}
