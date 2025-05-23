/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package thirdB;

public class thirdB5_RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Hello   World  ";
        System.out.println("String without whitespace: '" + removeWhitespace(input) + "'");
    }
}
