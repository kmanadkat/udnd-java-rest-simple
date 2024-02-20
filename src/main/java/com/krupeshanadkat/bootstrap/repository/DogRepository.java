package com.krupeshanadkat.bootstrap.repository;

import com.krupeshanadkat.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.name from Dog d")
    List<String> findAllName();
}
