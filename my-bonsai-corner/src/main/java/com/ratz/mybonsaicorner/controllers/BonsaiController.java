package com.ratz.mybonsaicorner.controllers;

import com.ratz.mybonsaicorner.entities.Bonsai;
import com.ratz.mybonsaicorner.services.BonsaiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BonsaiController {

    @Autowired
    private BonsaiServiceImpl bonsaiServiceImpl;

    @PostMapping("/new")
    public ResponseEntity<Bonsai> addNewBonsai(@RequestBody Bonsai bonsai) {
        bonsaiServiceImpl.addBonsai(bonsai);
        return new ResponseEntity<>(bonsai, HttpStatus.OK) ;
    }

    @GetMapping("/mybonsais")
    public ResponseEntity<List<Bonsai>> findAllBonsai(){
        return new ResponseEntity<>(bonsaiServiceImpl.getAllBonsai(), HttpStatus.OK) ;
    }
}
