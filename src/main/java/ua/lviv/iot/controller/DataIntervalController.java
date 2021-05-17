package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.domain.DataInterval;
import ua.lviv.iot.service.DataIntervalService;
import ua.lviv.iot.service.ServiceTemplate;

@RestController
@RequestMapping("/data-interval")
public class DataIntervalController extends BaseController<DataInterval, Integer> {

    @Autowired
    DataIntervalService dataIntervalService;

    @Override
    public ServiceTemplate<DataInterval, Integer> getService(){
        return dataIntervalService;
    }

}
