package com.krupeshanadkat.bootstrap.web;

import com.krupeshanadkat.bootstrap.entity.Dog;
import com.krupeshanadkat.bootstrap.service.DogService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "This is a bad request, please follow api documentation"),
        @ApiResponse(responseCode = "401", description = "Due to security constraints, you access request cannot be authorized"),
        @ApiResponse(responseCode = "404", description = "Resource you are looking for doesnot exists"),
        @ApiResponse(responseCode = "500", description = "Internal server error")
})
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService){
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> list = dogService.retrieveDogs();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds() {
        List<String> dogBreeds = dogService.retrieveDogBreeds();
        return new ResponseEntity<List<String>>(dogBreeds, HttpStatus.OK);
    }

    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getDogNames() {
        List<String> list = dogService.retrieveDogNames();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id) {
        String dogBreed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(dogBreed, HttpStatus.OK);
    }

}









