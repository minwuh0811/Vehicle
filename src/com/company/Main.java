package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Scanner scanner;
    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Cars cars=new Cars();
        cars.setColours();
        cars.setDoors();
        cars.setSizes();
        cars.setYears();
        Main main = new Main(new Scanner(System.in));
        while (true) {
            System.out.println("What Cars do you want? press 1. Default, press 2. User decision, press 3. Random and press 4. Exit");
            int choice = Integer.parseInt(main.getString());
            switch (choice) {
                case (1):
                    Default carDefault = new Default();
                    System.out.println(carDefault);
                    break;
                case (2):
                    System.out.println("What is the color?");
                    System.out.println(cars.getColours());
                    String color = main.getString();
                    System.out.println("How many doors?");
                    System.out.println(cars.getDoors());
                    int door = Integer.parseInt(main.getString());
                    System.out.println("What is the size? Enter: Small, Medium or Large");
                    System.out.println(cars.getSizes());
                    String size = main.getString();
                    System.out.println("Which year?");
                    System.out.println(cars.getYears());
                    int year = Integer.parseInt(main.getString());
                    Car usesCar = new Car(color, door, size, year);
                    System.out.println(usesCar);
                    break;
                case (3):
                    Random random = new Random();
                    int range = cars.getColours().size();
                    System.out.println(range);
                    color = cars.getColours().get(random.nextInt(range));
                    range = cars.getDoors().size();
                    door = cars.getDoors().get(random.nextInt(range));
                    range = cars.getSizes().size();
                    size = cars.getSizes().get(random.nextInt(range));
                    range = cars.getYears().size();
                    year = cars.getYears().get(random.nextInt(range));
                    RandomCar randomCar = new RandomCar(new Car(color, door, size, year));
                    System.out.println(randomCar);
                    break;
                case (4):
                    return;
            }
        }
    }


    public String getString(){
        return scanner.nextLine();
    }



}
