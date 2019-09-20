package com.company;

import java.util.ArrayList;

public class Car {
    public String Colour;
    public int door;
    public String size;
    public int year;


    public Car(String colour, int door, String size, int year) {
        this.Colour = colour;
        this.door = door;
        this.size = size;
        this.year = year;
    }

    public Car() {
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Colour='" + Colour + '\'' +
                ", door=" + door +
                ", size='" + size + '\'' +
                ", year=" + year +
                '}';
    }
}

