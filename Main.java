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
