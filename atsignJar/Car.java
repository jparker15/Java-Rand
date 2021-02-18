package atsignJar;

public class Car {
    private String color;
    public String model;
    private String vin;
    private int tireCount;
    private int year;
    private boolean isOn = false;

    /*Declaration of a public Car method*/
    public Car(String color, String model, String vin, int tireCount, int year){
        /*Definition*/
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = tireCount;
        this.year = year;
        isOn = false;
    }
    /*Overload of car method if tireCount is not set*/
    public Car(String color, String model, String vin, int year){
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = 4;
        this.year = year;
        isOn = false;
    }

    public void drive(){
        if(!isOn){
            System.out.println("Start the car first.");
            return;
        }
        System.out.println("Driving!");
    }

    public void setOn(boolean on) {
        if(isOn && on){
            System.out.print("Screech! Car is already on!");
            return;
        }
        if(!isOn && !on){
            System.out.println("Radio has started");
            return;
        }
        isOn = on;
    }
    public void toggleOn(){
        isOn = !isOn;
    }
    public void displayDetails(){
        /* %s = string placeholder %i = int */
        System.out.printf("Vehicle Details %s %s %s", color, year, model);
    }
    @Override
    public String toString(){
        return "Vehicle Details" + " " + color + " " + year + " " + model + ".";
    }
}
