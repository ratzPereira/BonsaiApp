package com.ratz.mybonsaicorner.services;

import com.ratz.mybonsaicorner.entities.Bonsai;
import com.ratz.mybonsaicorner.repositories.BonsaiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BonsaiServiceImpl implements BonsaiService {


    private BonsaiRepository bonsaiRepository;

    //injecting dependency by constructor instead of autowiring BonsaiRepository
    public BonsaiServiceImpl(BonsaiRepository bonsaiRepository) {
        this.bonsaiRepository = bonsaiRepository;
    }

    //methods here
    public void addBonsai(Bonsai bonsai) {
        bonsai.setId(generateBonsaiIdNumber());
        this.bonsaiRepository.save(bonsai);
    }

    public List<Bonsai> getAllBonsai() {
        return this.bonsaiRepository.findAll();
    }

    private String generateBonsaiIdNumber() {

        // generate a random UUID number (UUID version-4)
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        return  uuid;
    }
}
