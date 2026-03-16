// =======================================================
//  Avi Patel(student1), Jaswinder Singh(Student2), Jaskaran Singh(Student3)
// Role: Integration of all modules
// =======================================================

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        try {

            // Step 1: Input Student Name
            System.out.print("Enter Name of the student: ");
            String name = scanner.nextLine();

            if (!InputValidator.validateName(name)) {
                throw new Exception("Invalid Name Format");
            }
              // Step 3: Enter  Email
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            if (!InputValidator.validateEmail(email)) {
                throw new Exception("Invalid Email Format");
            }

            // Step 4: Enter name of the Course
            System.out.print("Enter Course: ");
            String course = scanner.nextLine();
             // Step 5: Create Student Object
            Student student = new Student(name, id, email, course);

            // Step 6: Add to ArrayList
            manager.addStudent(student);

            // Step 7: Display Students
            manager.displayStudents();

