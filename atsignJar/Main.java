package atsignJar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Learning Java again!");

        Car myCar = new Car("gold","Volvo","6849",2009);
        System.out.println(myCar.model);
        myCar.model = "850";
        System.out.println(myCar.model);
        System.out.println(myCar.toString());
        myCar.displayDetails();
    }
}
