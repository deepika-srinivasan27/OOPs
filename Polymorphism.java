package Basics;

// Base class
class Animal {
    // Method that can be overridden
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass Dog that overrides the sound method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Subclass Cat that overrides the sound method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

// Main class to test polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Create Animal objects for Dog and Cat
        Animal myDog = new Dog(); // Polymorphism
        Animal myCat = new Cat(); // Polymorphism

        // Call the sound method on each object
        myDog.sound();  // Output: Dog barks.
        myCat.sound();  // Output: Cat meows.
    }
}

