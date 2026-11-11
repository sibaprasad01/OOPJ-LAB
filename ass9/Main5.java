class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency depends on the vehicle.");
    }

    void distanceTravelled(double distance) {
        System.out.println("Distance travelled: " + distance + " km");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed depends on the vehicle.");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

   
    void fuelEfficiency() {
        System.out.println("Truck fuel efficiency: 8 km/l");
    }

    
    void maximumSpeed() {
        System.out.println("Truck maximum speed: 120 km/h");
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

   
    void fuelEfficiency() {
        System.out.println("Car fuel efficiency: 18 km/l");
    }

   
    void maximumSpeed() {
        System.out.println("Car maximum speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

  
    void fuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency: 45 km/l");
    }

   
    void maximumSpeed() {
        System.out.println("Motorcycle maximum speed: 150 km/h");
    }
}

public class Main5 {
    public static void main(String[] args) {

        Truck truck = new Truck("Tata", "Prima", 2024, "Diesel");
        Car car = new Car("Hyundai", "i20", 2025, "Petrol");
        Motorcycle bike = new Motorcycle("Honda", "Shine", 2024, "Petrol");

        System.out.println("Truck:");
        truck.fuelEfficiency();
        truck.distanceTravelled(500);
        truck.maximumSpeed();

        System.out.println();

        System.out.println("Car:");
        car.fuelEfficiency();
        car.distanceTravelled(300);
        car.maximumSpeed();

        System.out.println();

        System.out.println("Motorcycle:");
        bike.fuelEfficiency();
        bike.distanceTravelled(200);
        bike.maximumSpeed();
    }
}
