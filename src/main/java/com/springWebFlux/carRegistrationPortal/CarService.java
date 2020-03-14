package com.springWebFlux.carRegistrationPortal;

import com.springWebFlux.carRegistrationPortal.model.Car;
import com.springWebFlux.carRegistrationPortal.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Flux<Car> getAllCars (){
        return carRepository.findAll()
                .switchIfEmpty(Flux.empty());
    }

    public Mono saveCar (Car car){
        return carRepository.save(car);
    }

    public Mono updateCar(String id, Car car){
        return carRepository.save(car);
    }

    public Mono<Car> getCarById(String id ) {
        return carRepository.findById(id)
                .switchIfEmpty(Mono.empty());
    }

    public Mono delete (String id){
        return carRepository.deleteById(id);
}

}
