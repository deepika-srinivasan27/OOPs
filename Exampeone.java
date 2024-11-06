package Basics;

// Base class
class Individual {
    // Encapsulated fields
    private String fullName;
    private int years;

    // Constructor
    public Individual(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }

    // Getter methods (for encapsulation)
    public String getFullName() {
        return fullName;
    }

    public int getYears() {
        return years;
    }

    // Method to display individual details
    public void showDetails() {
        System.out.println("Full Name: " + fullName + ", Years: " + years);
    }
}

// Derived class (Learner extends Individual)
class Learner extends Individual {
    private String learnerId;

    // Constructor
    public Learner(String fullName, int years, String learnerId) {
        super(fullName, years);  // Calling the constructor of the superclass (Individual)
        this.learnerId = learnerId;
    }

    // Getter for learner ID
    public String getLearnerId() {
        return learnerId;
    }

    // Overriding the showDetails method to include learner ID
    @Override
    public void showDetails() {
        super.showDetails();  // Calling the superclass showDetails
        System.out.println("Learner ID: " + learnerId);
    }
}

public class Exampeone {
    public static void main(String[] args) {
        // Creating an Individual object
        Individual person = new Individual("John Doe", 45);
        person.showDetails();

        // Creating a Learner object
        Learner student = new Learner("Jane Smith", 22, "L45678");
        student.showDetails();
    }
}

