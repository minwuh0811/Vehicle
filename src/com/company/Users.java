package com.company;

public class Users {
    private Car car;

    public Users(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Users{" +
                "car=" + car +
                '}';
    }
}
