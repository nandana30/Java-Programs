import java.util.Scanner;
import java.time.Year;

class Vehicle {
    String brand;
    String model;
    int year;
    double basePrice;

    Vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Price: " + basePrice);
    }

    double calculateResaleValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        return basePrice * Math.pow(0.85, age);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int year, double basePrice, int numberOfDoors) {
        super(brand, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Resale Value: " + String.format("%.2f", calculateResaleValue()));
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String brand, String model, int year, double basePrice, boolean hasSidecar) {
        super(brand, model, year, basePrice);
        this.hasSidecar = hasSidecar;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Resale Value: " + String.format("%.2f", calculateResaleValue()));
        System.out.println();
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of the Car:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Model: ");
        String carModel = sc.nextLine();

        System.out.print("Year: ");
        int carYear = sc.nextInt();

        System.out.print("Base Price: ");
        double carPrice = sc.nextDouble();

        System.out.print("Number of Doors: ");
        int doors = sc.nextInt();
        sc.nextLine(); 

        System.out.println();

        System.out.println("Enter details of the Motorcycle:");
        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Model: ");
        String bikeModel = sc.nextLine();

        System.out.print("Year: ");
        int bikeYear = sc.nextInt();

        System.out.print("Base Price: ");
        double bikePrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = sc.nextBoolean();

        System.out.println();

        Car car = new Car(carBrand, carModel, carYear, carPrice, doors);
        Motorcycle bike = new Motorcycle(bikeBrand, bikeModel, bikeYear, bikePrice, hasSidecar);

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("Motorcycle Details:");
        bike.displayInfo();

        sc.close();
    }
}

