package com.ratz.mybonsaicorner.controllers;

import com.ratz.mybonsaicorner.entities.Bonsai;
import com.ratz.mybonsaicorner.entities.User;
import com.ratz.mybonsaicorner.services.BonsaiServiceImpl;
import com.ratz.mybonsaicorner.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;


@RestController
@Validated
public class BonsaiController {

    @Autowired
    private BonsaiServiceImpl bonsaiServiceImpl;

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/bonsai/{id}/new")
    public ResponseEntity<Object> addNewBonsai(@PathVariable int id, @Valid @RequestBody Bonsai bonsai) {

        User user = userService.findUserById(id);
        bonsai.setUser(user);
        bonsaiServiceImpl.addBonsai(bonsai);
        URI location = ServletUriComponentsBuilder.fromUriString("http://localhost:8080/bonsais").path("/{id}").buildAndExpand(bonsai.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
