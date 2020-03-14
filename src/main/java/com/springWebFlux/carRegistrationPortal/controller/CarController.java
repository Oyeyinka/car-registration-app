package com.springWebFlux.carRegistrationPortal.controller;

import com.springWebFlux.carRegistrationPortal.CarService;
import com.springWebFlux.carRegistrationPortal.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("carPortal")

public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/getAllCars")
    public Flux<Car> getAllCars(){
       return carService.getAllCars();
    }

    @PostMapping("/saveCar")
    public Mono saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @GetMapping("/getCarById")
    public Mono<Car> getCarById(@RequestParam String id){
        return carService.getCarById(id);
    }

    @PutMapping("{id}")
    public Mono updateCarById(@RequestParam String id, @RequestBody Car car){
        return carService.updateCar(id, car);
    }

    @DeleteMapping("{id}")
    public Mono deleteCar(@RequestParam String id){
        return carService.delete(id);
    }
}
