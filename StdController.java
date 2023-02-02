package com.example.Student.Student.Controller;

import com.example.Student.Student.entity.StdEntity;
import com.example.Student.Student.service.Stdserviceinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdController {
    @Autowired
    private Stdserviceinterface stdserviceinterface;
    @PostMapping("/students")
    public StdEntity savestudent(@RequestBody StdEntity stdEntity)
    {
        return stdserviceinterface.savestudent(stdEntity);
    }
}
