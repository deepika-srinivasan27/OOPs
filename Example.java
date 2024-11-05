package Basics;


// Abstract class Animal
abstract class Creature {
    // Abstract method (no implementation here)
    abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Dog class inherits Animal
class Small extends Creature {
    // Implement the abstract method sound for Dog
    @Override
    public void sound() {
        System.out.println("The dog says: Woof Woof");
    }
}

// Cat class inherits Animal
class Ca extends Creature {
    // Implement the abstract method sound for Cat
    @Override
    public void sound() {
        System.out.println("The cat says: Meow Meow");
    }
}

// Main class
public class Example {
    public static void main(String[] args) {
        // Polymorphism: Animal reference pointing to Dog and Cat objects
        Creature myDog = new Small();
        Creature myCat = new Ca();

        // Call the sound method of each object
        myDog.sound();  // Output: The dog says: Woof Woof
        myCat.sound();  // Output: The cat says: Meow Meow

        // Call the sleep method from Animal class
        myDog.sleep();  // Output: The animal is sleeping.
        myCat.sleep();  // Output: The animal is sleeping.
    }
}
