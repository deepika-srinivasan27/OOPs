package Basics;


class Student {
    // Private variables (encapsulated)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {  // A basic validation check
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Set the student's name and age using setters
        student.setName("Alice");
        student.setAge(20);

        // Access and print the student's name and age using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

