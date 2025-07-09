

public class CheckInputData {
    public static boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }

    public static boolean isValidName(String name) {
        return name != null && name.length() <= 50 && !name.trim().isEmpty();
    }
}
