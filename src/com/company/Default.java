package com.company;

public class Default {
    private Car car= new Car("black", 4, "small", 2019);

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Default{" +
                "car=" + car +
                '}';
    }
}
