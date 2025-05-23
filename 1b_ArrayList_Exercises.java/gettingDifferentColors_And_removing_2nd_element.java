/* 1b2 Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
package java_Assignment;

import java.util.ArrayList;
import java.util.List;

public class gettingDifferentColors_And_removing_2nd_element {
	 public static void main(String[] args) {
	        // Initialize an ArrayList to store colors
	        List<String> colors = new ArrayList<>();
	//adding elements
	        colors.add("Red");
	        colors.add("Purple");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        //getting different colors
	        System.out.println("getting different colors:"+ colors);
	        //removing second element
	        colors.remove(1);
	        System.out.println("second element is removed:"+colors);
	        //removing color blue
	        colors.remove("Blue");
	        System.out.println("After removing 'Blue': " + colors);
	    }

	   
	    }



