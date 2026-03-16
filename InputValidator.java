
//  InputValidator.java
// code by  Jaswinder Singh
// Role: Validation using Regular Expressions
// =======================================================

import java.util.regex.Pattern;

public class InputValidator {

    s
    public static boolean validateStudentID(String id) {
        return Pattern.matches("S-\\d{4}", id);
    }