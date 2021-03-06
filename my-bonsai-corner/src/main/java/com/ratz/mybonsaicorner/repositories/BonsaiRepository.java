package com.ratz.mybonsaicorner.repositories;

import com.ratz.mybonsaicorner.entities.Bonsai;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource()
public interface BonsaiRepository extends JpaRepository<Bonsai,String> {

    //behind the scenes spring will execute SELECT * FROM bonsai where bonsai.name LIKE CONCAT("%", :name, "%")
    //Spring Data REST automatically expose endpoint
    //TODO: add pagination
    List<Bonsai> findBonsaiByName(@RequestParam("name") String name);

    @Override
    @RestResource(exported = false)
    void delete(Bonsai bonsai);
}
