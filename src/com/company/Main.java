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
        Main main = new Main(new Scanner(System.in));
        while (true) {
            System.out.println("What Cars do you want? press 1 default, press 2 user decision, press 3 random, press 4 exit");
            int choice = Integer.parseInt(main.getString());
            switch (choice) {
                case (1):
                    Default carDefault = new Default();
                    System.out.println(carDefault);
                    break;
                case (2):
                    System.out.println("What is the color?");
                    System.out.println(car.getColours());
                    String color = main.getString();
                    System.out.println("How many doors?");
                    System.out.println(car.getDoors());
                    int door = Integer.parseInt(main.getString());
                    System.out.println("What is the size? Enter: Small, Medium or Large");
                    System.out.println(car.getSizes());
                    String size = main.getString();
                    System.out.println("Which year?");
                    System.out.println(car.getYears());
                    int year = Integer.parseInt(main.getString());
                    Car usesCar = new Car(color, door, size, year);
                    System.out.println(usesCar);
                    break;
                case (3):
                    Random random = new Random();
                    int range = car.getColours().size();
                    System.out.println(range);
                    color = car.getColours().get(random.nextInt(range));
                    range = car.getDoors().size();
                    door = car.getDoors().get(random.nextInt(range));
                    range = car.getSizes().size();
                    size = car.getSizes().get(random.nextInt(range));
                    range = car.getYears().size();
                    year = car.getYears().get(random.nextInt(range));
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
