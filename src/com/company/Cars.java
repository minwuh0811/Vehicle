package com.company;

import java.util.ArrayList;

public class Cars {
    public ArrayList<String> Colours=new ArrayList<>();
    public ArrayList<String> sizes=new ArrayList<>();
    public ArrayList<Integer> doors= new ArrayList<>();
    public ArrayList<Integer> years = new ArrayList<>();

    public void addColours (String colour) {
        Colours.add(colour);
    }

    public void addSizes (String size) {
        sizes.add(size);
    }

    public void addDoors (int door) {
        doors.add(door);
    }

    public void addYears(int year) {
        years.add(year);
    }

    public ArrayList<String> getColours() {
        return Colours;
    }

    public void setColours() {
        Colours.add("Black");
        Colours.add("White");
        Colours.add("Yellow");
        Colours.add("Blue");
    }

    public ArrayList<String> getSizes() {
        return sizes;
    }

    public void setSizes() {
        sizes.add("Small");
        sizes.add("Medium");
        sizes.add("Large");
    }

    public ArrayList<Integer> getDoors() {
        return doors;
    }

    public void setDoors() {
        doors.add(2);
        doors.add(4);
        doors.add(3);
        doors.add(5);
    }

    public ArrayList<Integer> getYears() {
        return years;
    }

    public void setYears() {
        years.add(2019);
        years.add(2018);
        years.add(2016);
    }


}
