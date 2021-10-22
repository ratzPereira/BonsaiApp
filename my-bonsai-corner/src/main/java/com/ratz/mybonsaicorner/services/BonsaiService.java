package com.ratz.mybonsaicorner.services;

import com.ratz.mybonsaicorner.entities.Bonsai;

import java.util.List;


public interface BonsaiService {

    void addBonsai(Bonsai bonsai);
    List<Bonsai> getAllBonsai();
}
