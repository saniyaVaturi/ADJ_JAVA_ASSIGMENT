/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package thirdB;

public class thirdB3_ReversetSring {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Reversed String: " + reverseString(input));
    }
}
