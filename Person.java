// =======================================================

// Author: Avi Patel
// Role: OOP Design (Abstract Class, Encapsulation)
// =======================================================

// Step 1: Create abstract base class Person
// This acts as a blueprint for Student and Instructor classes

public abstract class Person {

    // Step 2: Private fields (Encapsulation)
    private String name;
    private String id;
    private String email;

    // Step 3: Constructor to initialize fields
    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    // Step 4: Getters and Setters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    // Step 5: Abstract method for polymorphism
    public abstract String getDetails();
}