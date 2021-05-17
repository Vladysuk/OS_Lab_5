package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.DataInterval;
import ua.lviv.iot.repository.DataIntervalRepository;

@Service
public class DataIntervalService extends BaseService<DataInterval, Integer> {

    @Autowired
    DataIntervalRepository dataIntervalRepository;

    @Override
    public JpaRepository<DataInterval, Integer> getRepository() {
        return dataIntervalRepository;
    }

}
