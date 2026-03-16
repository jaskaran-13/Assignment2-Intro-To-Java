// =======================================================
// by  Avi Patel
// Role: Demonstrating Polymorphism
// =======================================================

public class Instructor extends Person {

    private String department;

    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        this.department = department;
    }

    // Method overriding
    @Override
    public String getDetails() {
        return "Instructor Name: " + getName()
                + "\nID: " + getId()
                + "\nEmail: " + getEmail()
                + "\nDepartment: " + department;
    }
}