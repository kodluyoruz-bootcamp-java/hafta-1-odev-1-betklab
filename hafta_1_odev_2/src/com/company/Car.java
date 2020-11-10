package com.company;

public class Car {
    private int yearModel;
    private int speed;
    private int gear;
    private String color;

    public Car(int speed, int gear, String color, int yearModel) {
        this.yearModel = yearModel;
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void startEngine(){
        System.out.println("Engine started");
    }
    public void drive(){
        this.gear=1;
        System.out.println("Driving");
    }
    public void stop(){
        this.speed=0;
        System.out.println("Car stopped");
    }
}
class MyClass{
    public static void main(String[] args) {
       Car betulsCar = new Car (100, 2, "Red",2019);
        System.out.println("New car created:");
        System.out.println("Year Model:" + betulsCar.getYearModel());
        System.out.println("Speed:" + betulsCar.getSpeed());
        System.out.println("Gear:" + betulsCar.getGear());
        System.out.println("Color:" + betulsCar.getColor());
        int vites = betulsCar.getGear();
        System.out.println(vites);
        betulsCar.setColor("Blue");
        System.out.println("Betuls car color : " + betulsCar.getColor());


        int i = 0;
        while(i<5){
            betulsCar.startEngine();
            betulsCar.drive();
            betulsCar.stop();
            i++;
        }
    }

}
