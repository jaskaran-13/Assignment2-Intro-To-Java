
//  InputValidator.java
// code by  Jaswinder Singh
// Role: Validation using Regular Expressions
// =======================================================

import java.util.regex.Pattern;

public class InputValidator {

    // Step 1: Validate Student ID (Format S-1234)
    public static boolean validateStudentID(String id) {
        return Pattern.matches("S-\\d{4}", id);
    }
    // Step 2:  code to Validate Email
    public static boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }
     // Step 3: Validate Name, allowing only letters and spaces
    public static boolean validateName(String name) {
        return Pattern.matches("[A-Za-z ]+", name);
    }
}