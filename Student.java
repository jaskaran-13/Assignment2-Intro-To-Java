// Step 1: Student class extends Person class

public class Student extends Person {

    private String course;

    // Step 2:  created Constructor
    public Student(String name, String id, String email, String course) {
        super(name, id, email);
        this.course = course;
    }

    // Step 3:  Created Getter
    public String getCourse() {
        return course;
    }

    // Step 4: Method overriding (Polymorphism)
    @Override
    public String getDetails() {
        return "Student Name: " + getName()
                + "\nID: " + getId()
                + "\nEmail: " + getEmail()
                + "\nCourse: " + course;
    }
}