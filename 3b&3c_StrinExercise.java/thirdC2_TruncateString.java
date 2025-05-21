package thirdC;

public class thirdC2_TruncateString {
    public static String truncate(String str, int length) {
        if (str == null || str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a long string that needs to be truncated";
        System.out.println("Truncated: " + truncate(input, 20));
    }
}
