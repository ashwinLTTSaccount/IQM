package com.example.IQM.IQM.controller;

import com.example.IQM.IQM.models.TaskData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IqmController {
    @PostMapping("/iqm")
    public ResponseEntity<?> iqm(@RequestBody TaskData taskData){
        try {
            Thread.sleep(15000);
            return new ResponseEntity<>(taskData, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
