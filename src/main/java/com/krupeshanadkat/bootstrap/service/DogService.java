package com.krupeshanadkat.bootstrap.service;

import com.krupeshanadkat.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreeds();
    List<String> retrieveDogNames();
    String retrieveDogBreedById(Long id);
}
