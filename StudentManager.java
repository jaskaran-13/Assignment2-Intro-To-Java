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