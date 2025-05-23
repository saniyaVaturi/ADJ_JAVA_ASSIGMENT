/*1c1 Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package LinkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedList_iteratingFrom2ndPos {

	

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        List<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        
//all the element
	        System.out.println("added elements"+colors);
	        System.out.println("Iterating through the list starting from the 2nd color:");
	        // Iterate using a for loop starting from index 1
	        for (int i = 1; i < colors.size(); i++) {
	            System.out.println(colors.get(i));
	        }
	    }
	}
