/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
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
