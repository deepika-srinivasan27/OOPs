package Basics;

//Single level
//class Human{
//    void eat(){
//        System.out.println("Eating...");
//    }
//}
//
//class Puppy extends Human{
//    void bark(){
//        System.out.println("Barking");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        Puppy myDog = new Puppy();
//
//        myDog.eat();
//        myDog.bark();
//    }
//}

// Multilevel Inheritance

// Base class
//class Vehicle {
//    // Method in the Vehicle class
//    void start() {
//        System.out.println("Vehicle is starting.");
//    }
//}
//
//// Derived class Car that inherits from Vehicle
//class Car extends Vehicle {
//    // Method in the Car class
//    void drive() {
//        System.out.println("Car is being driven.");
//    }
//}
//
//// Derived class ElectricCar that inherits from Car
//class ElectricCar extends Car {
//    // Method in the ElectricCar class
//    void charge() {
//        System.out.println("Electric car is charging.");
//    }
//}
//
//// Main class to test multilevel inheritance
//public class Inheritance {
//    public static void main(String[] args) {
//        // Create an object of ElectricCar class
//        ElectricCar myElectricCar = new ElectricCar();
//
//        // Call methods from Vehicle, Car, and ElectricCar classes
//        myElectricCar.start();   // Output: Vehicle is starting.
//        myElectricCar.drive();   // Output: Car is being driven.
//        myElectricCar.charge();  // Output: Electric car is charging.
//    }
//}


// Hirarchical

// Base class
// Base class
class Appliance {
    // Method in the Appliance class
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
}

// Derived class WashingMachine that inherits from Appliance
class WashingMachine extends Appliance {
    // Method specific to WashingMachine
    void washClothes() {
        System.out.println("Washing machine is washing clothes.");
    }
}

// Derived class Refrigerator that inherits from Appliance
class Refrigerator extends Appliance {
    // Method specific to Refrigerator
    void coolFood() {
        System.out.println("Refrigerator is cooling food.");
    }
}

// Main class to test hierarchical inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an object of WashingMachine class
        WashingMachine myWashingMachine = new WashingMachine();
        myWashingMachine.turnOn();      // Output: Appliance is turned on.
        myWashingMachine.washClothes(); // Output: Washing machine is washing clothes.

        // Create an object of Refrigerator class
        Refrigerator myRefrigerator = new Refrigerator();
        myRefrigerator.turnOn();       // Output: Appliance is turned on.
        myRefrigerator.coolFood();     // Output: Refrigerator is cooling food.
    }
}

