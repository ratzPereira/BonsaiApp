package com.ratz.mybonsaicorner.repositories;

import com.ratz.mybonsaicorner.entities.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource()
public interface InterventionRepository extends JpaRepository<Intervention,Integer> {

    @Override
    @RestResource(exported = false)
    void delete(Intervention intervention);
}
