package com.springWebFlux.carRegistrationPortal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "car_registration_details")
public class Car {
    @Id
    private String id;
    private String LicensePlateNo;
    private String VehicleIdentificationNo;
    private String City;
    private String CarMake;
    private String CarModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicensePlateNo() {
        return LicensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        LicensePlateNo = licensePlateNo;
    }

    public String getVehicleIdentificationNo() {
        return VehicleIdentificationNo;
    }

    public void setVehicleIdentificationNo(String vehicleIdentificationNo) {
        VehicleIdentificationNo = vehicleIdentificationNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCarMake() {
        return CarMake;
    }

    public void setCarMake(String carMake) {
        CarMake = carMake;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

}
