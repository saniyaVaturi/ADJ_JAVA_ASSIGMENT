package thirdC;

public class thirdC3_NumericChecker {
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is Numeric? " + isNumeric(input));
    }
}
