package java_Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_gettingDifferentColorsAndSorting {



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
        
        // Sorting the colors
        Collections.sort(colors);
        
        // Displaying the sorted list of colors
        System.out.println("Sorted colors: " + colors);
    }
}