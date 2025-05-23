/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package thirdB;

public class thirdB2_SubstringCounter {


    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainStr = "abababab";
        String subStr = "ab";
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }
}
