package LinkedList;
import java.util.LinkedList;
public class LinkedList_inserting_at_specified_pos {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Purple");
        linkedList.add("Yellow");
        linkedList.add("Red");

        System.out.println("Initial linked list: " + linkedList);

        // Specify the element to insert at the end
        String newElement = "Pink";

        // Insert the element at the end using offerLast()
        linkedList.offerLast(newElement);

        System.out.println("Linked list after inserting '" + newElement + "' at the end: " + linkedList);
    }
}