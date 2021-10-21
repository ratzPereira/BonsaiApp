package com.ratz.mybonsaicorner.controllers;

import com.ratz.mybonsaicorner.entities.Bonsai;
import com.ratz.mybonsaicorner.services.BonsaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BonsaiController {

    @Autowired
    private BonsaiService bonsaiService;

    @PostMapping("/new")
    public Bonsai addNewBonsai(@RequestBody Bonsai bonsai) {
        bonsaiService.addBonsai(bonsai);
        return bonsai;
    }

    @GetMapping("/mybonsais")
    public List<Bonsai> findAllBonsai(){
        return bonsaiService.getAllBonsai();
    }
}
