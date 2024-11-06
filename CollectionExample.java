package Basics;

import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Accessing an element at a specific index
        System.out.println("First fruit in the list: " + fruits.get(0));

        // Displaying all elements using a for-each loop
        System.out.println("List of all fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element by name
        fruits.remove("Banana");

        // Displaying the list after removal
        System.out.println("List after removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if a specific fruit is in the list
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list.");
        } else {
            System.out.println("Mango is not in the list.");
        }

        // Checking the size of the ArrayList
        System.out.println("Total number of fruits: " + fruits.size());
    }
}

