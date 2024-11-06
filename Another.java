package Basics;

// Base class
class Transport {
    // Encapsulated fields
    private String brand;
    private int manufactureYear;

    // Constructor
    public Transport(String brand, int manufactureYear) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
    }

    // Getter methods (for encapsulation)
    public String getBrand() {
        return brand;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    // Method to display transport details
    public void printInfo() {
        System.out.println("Brand: " + brand + ", Manufacture Year: " + manufactureYear);
    }
}

// Derived class (Auto extends Transport)
class Auto extends Transport {
    private String type;
    private boolean electricPowered;

    // Constructor
    public Auto(String brand, int manufactureYear, String type, boolean electricPowered) {
        super(brand, manufactureYear);  // Calling the constructor of the superclass (Transport)
        this.type = type;
        this.electricPowered = electricPowered;
    }

    // Getter for type and electricPowered status
    public String getType() {
        return type;
    }

    public boolean isElectricPowered() {
        return electricPowered;
    }

    // Overriding the printInfo method to include Auto-specific details
    @Override
    public void printInfo() {
        super.printInfo();  // Calling the superclass printInfo
        System.out.println("Type: " + type + ", Electric Powered: " + (electricPowered ? "Yes" : "No"));
    }
}

public class Another {
    public static void main(String[] args) {
        // Creating a Transport object
        Transport vehicle = new Transport("Toyota", 2015);
        vehicle.printInfo();

        // Creating an Auto object
        Auto car = new Auto("Tesla", 2021, "Sedan", true);
        car.printInfo();
    }
}

