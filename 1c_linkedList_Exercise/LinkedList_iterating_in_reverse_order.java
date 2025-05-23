/*1c2 Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList_iterating_in_reverse_order {




    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Fig");

        System.out.println("Iterating through the linked list in reverse order:");

        // Get a descending iterator for the linked list
        Iterator<String> reverseIterator = linkedList.descendingIterator();

        // Iterate through the list in reverse using the iterator
        while (reverseIterator.hasNext()) {
            String element = reverseIterator.next();
            System.out.println(element);
        }
    }
}
