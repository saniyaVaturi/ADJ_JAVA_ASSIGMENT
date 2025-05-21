package LinkedList;
import java.util.LinkedList;
public class LinkedList_displayAllElement_and_Position {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Fig");

        System.out.println("Elements and their positions in the linked list:");

        // Iterate through the linked list using index
        for (int p = 0; p < linkedList.size(); p++) {
            String element = linkedList.get(p);
            System.out.println("Element at position " + p + ": " + element);
        }
    }
}