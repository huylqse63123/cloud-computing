package com.cloudcomputing.nhatro.controller;

import com.cloudcomputing.nhatro.entity.Bedsit;
import com.cloudcomputing.nhatro.service.BedsitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/bedsits")
public class BedsitController {

    private final BedsitService bedsitService;

    public BedsitController(BedsitService bedsitService) {
        this.bedsitService = bedsitService;
    }

    @GetMapping("")
    public Collection<Bedsit> findAll() {
        Collection<Bedsit> bedsits = bedsitService.getAllBedsit();

        return bedsits;
    }
}
