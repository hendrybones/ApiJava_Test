package com.example.ApiJava.controller;

import com.example.ApiJava.model.Legislator;
import com.example.ApiJava.service.LegislatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LegislatorController {
    private LegislatorService legislatorService;


    public LegislatorController(LegislatorService legislatorService) {

        this.legislatorService = legislatorService;
    }

    @GetMapping(value = "/test")
    public List<Object> getLegislator(){
        return legislatorService.getLegislator();
    }


}
