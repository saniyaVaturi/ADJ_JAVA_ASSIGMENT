/*1b2 Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/

package java_Assignment;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_gettingDifferentColorsAndExtracting1stAnd2nd {




    public static void main(String[] args) {
        // Initialize an ArrayList to store colors
        List<String> colors = new ArrayList<>();
        
        // Adding elements
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        // Displaying the original list of colors
        System.out.println("Original colors: " + colors);
        
        // Extracting the 1st and 2nd elements using subList
        List<String> subList = colors.subList(0, 2); // Extracts elements at index 0 and 1
        
        // Displaying the extracted sublist
        System.out.println("Extracted colors (1st and 2nd): " + subList);
    }
}
