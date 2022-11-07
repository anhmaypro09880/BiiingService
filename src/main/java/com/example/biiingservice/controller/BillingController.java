package com.example.biiingservice.controller;


import com.example.biiingservice.entity.Billing;
import com.example.biiingservice.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingController {
    @Autowired
    private BillingRepository billingRepository;

    @GetMapping("/getAll")
    public List<Billing> getAll(){
        return billingRepository.findAll();
    }
}
