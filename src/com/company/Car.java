package com.company;

import java.util.ArrayList;

public class Car {
    public String Colour;
    public int door;
    public String size;
    public int year;


    public Car(String colour, int door, String size, int year) {
        Colour = colour;
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

    public ArrayList<String> getColours() {
        return Colours;
    }

    public void setColours(ArrayList<String> colours) {
        Colours = colours;
    }

    public ArrayList<String> getSizes() {
        return sizes;
    }

    public void setSizes(ArrayList<String> sizes) {
        this.sizes = sizes;
    }

    public void setDoors(ArrayList<Integer> doors) {
        this.doors = doors;
    }

    public ArrayList<Integer> getYears() {
        return years;
    }

    public void setYears(ArrayList<Integer> years) {
        this.years = years;
    }

    public ArrayList<Integer> getDoors() {
        return doors;
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
