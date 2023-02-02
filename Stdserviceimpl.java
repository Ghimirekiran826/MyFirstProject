package com.example.Student.Student.service;

import com.example.Student.Student.Repository.StdRepository;
import com.example.Student.Student.entity.StdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stdserviceimpl implements Stdserviceinterface{
    @Autowired
    private StdRepository stdRepository;
    @Override
    public StdEntity savestudent(StdEntity stdEntity) {
        return stdRepository.save(stdEntity);
    }
}
