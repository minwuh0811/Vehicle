package com.company;

import java.util.ArrayList;
import java.util.Random;

public class RandomCar {
    private Car car;

    public RandomCar(Car car) {
        this.car=car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "RandomCar{" +
                "car=" + car +
                '}';
    }
}
