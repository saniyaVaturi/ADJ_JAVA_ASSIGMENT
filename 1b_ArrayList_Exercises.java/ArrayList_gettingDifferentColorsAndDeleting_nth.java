/* 1b5 Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */

package java_Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_gettingDifferentColorsAndDeleting_nth {


	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        List<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Initial list of colors: " + colors);

	        // Get the index of the element to be deleted from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index of the element to delete (starting from 0): ");
	        int n = scanner.nextInt();

	        // Check if the index is valid
	        if (n >= 0 && n < colors.size()) {
	            // Remove the element at the specified index
	            String removedColor = colors.remove(n);
	            System.out.println("Removed color at index " + n + ": " + removedColor);
	            System.out.println("List of colors after deletion: " + colors);
	        } else {
	            System.out.println("Invalid index. Please enter an index within the bounds of the list.");
	        }

	        scanner.close();
	    }
	}
