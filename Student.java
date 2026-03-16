// =======================================================
// Code By: Avi Patel
//  Inheritance Implementation
// =======================================================

// Step 1: Student class extends Person class

public class Student extends Person {

    private String course;

    // Step 2:  created Constructor
    public Student(String name, String id, String email, String course) {
        super(name, id, email);
        this.course = course;
    }
