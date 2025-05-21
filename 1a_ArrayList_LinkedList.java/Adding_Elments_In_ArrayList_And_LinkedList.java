/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/
package ArrayListandLinkedList;
import java.util.*;
public class Adding_Elments_In_ArrayList_And_LinkedList {
	
	    public static void main(String[] args) {

	        // Declare ArrayList and LinkedList
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.addAll(arrayList); // Copying values to LinkedList

	        System.out.println("1. Elements in ArrayList: " + arrayList);
	        System.out.println("1. Elements in LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        System.out.println("2. Added 'Mango' at index 1:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Grape", "Pineapple");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        System.out.println("3. After adding multiple elements:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 4. Accessing elements
	        System.out.println("4. First element in ArrayList: " + arrayList.get(0));
	        System.out.println("First element in LinkedList: " + linkedList.get(0));

	        // 5. Updating elements
	        arrayList.set(2, "Kiwi");
	        linkedList.set(2, "Kiwi");

	        System.out.println("5. After updating index 2 to 'Kiwi':");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 6. Removing elements
	        arrayList.remove("Banana"); // remove by value
	        arrayList.remove(0);        // remove by index

	        linkedList.remove("Banana");
	        linkedList.remove(0);

	        System.out.println("6. After removing 'Banana' and first index:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 7. Searching elements
	        System.out.println("7. ArrayList contains 'Kiwi'? " + arrayList.contains("Kiwi"));
	        System.out.println("Index of 'Grape' in LinkedList: " + linkedList.indexOf("Grape"));

	        // 8. List size
	        System.out.println("8. Size of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating using for-each loop
	        System.out.println("9. Iterating over ArrayList using for-each:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("10. Iterating over LinkedList using Iterator:");
	        Iterator<String> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);

	        System.out.println("11. After Sorting:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 12. Sublist
	        List<String> subArrayList = arrayList.subList(0, 2);
	        List<String> subLinkedList = linkedList.subList(0, 2);

	        System.out.println("12. Sublist (0 to 2):");
	        System.out.println("ArrayList Sublist: " + subArrayList);
	        System.out.println("LinkedList Sublist: " + subLinkedList);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();

	        System.out.println("13. After clearing both lists:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);
	    }
	}
