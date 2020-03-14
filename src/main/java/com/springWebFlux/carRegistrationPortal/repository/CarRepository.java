package com.springWebFlux.carRegistrationPortal.repository;

import com.springWebFlux.carRegistrationPortal.model.Car;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends ReactiveMongoRepository<Car, String> {

}
