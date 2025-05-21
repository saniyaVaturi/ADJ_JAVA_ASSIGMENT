package thirdB;

public class thirdb1_null_or_whitespace {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String test = "   ";  // Change the input to test
        if (isNullOrEmpty(test)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }
    }
}
