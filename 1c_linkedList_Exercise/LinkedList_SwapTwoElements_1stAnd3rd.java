package LinkedList;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList_SwapTwoElements_1stAnd3rd {

	    public static void main(String[] args) {
	        // Create a LinkedList of strings
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Cherry");
	        linkedList.add("Date");

	        System.out.println("Linked list before swapping: " + linkedList);

	        // Specify the indices of the elements to swap (first and third)
	        int firstIndex = 0;
	        int thirdIndex = 2;

	        // Swap the elements using Collections.swap()
	        if (linkedList.size() > thirdIndex) {
	            Collections.swap(linkedList, firstIndex, thirdIndex);
	            System.out.println("Linked list after swapping the first and third elements: " + linkedList);
	        } else {
	            System.out.println("Cannot swap. The linked list does not have a third element.");
	        }
	    }
	}
