// =======================================================

// Code by: Jaskaran Singh
// Role: Collections (ArrayList) & Data Processing
// =======================================================

import java.util.ArrayList;

public class StudentManager {

    // Step 1: Created ArrayList to store student objects
    private ArrayList<Student> students = new ArrayList<>();
 // Step 2: Add Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Step 3: Remove Student by ID
    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }
    // Step 4: Search Student by ID
    public Student searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
     // Step 5: Show all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println("----------------------");
            System.out.println(student.getDetails());
        }
    }
}