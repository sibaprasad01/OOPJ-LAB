class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
   
    void drive() {
        System.out.println("Car is Reparing");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}