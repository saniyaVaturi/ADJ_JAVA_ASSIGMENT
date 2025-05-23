/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package thirdC;

public class thirdC5_WordCounter {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "Count the number of words in this sentence.";
        System.out.println("Word Count: " + countWords(input));
    }
}
