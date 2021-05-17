package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.Street;
import ua.lviv.iot.service.ServiceTemplate;
import ua.lviv.iot.service.StreetService;

@RestController
@RequestMapping("/street")
public class StreetController extends BaseController<Street, Integer> {

    @Autowired
    StreetService streetService;

    @Override
    public ServiceTemplate<Street, Integer> getService(){
        return streetService;
    }

}
