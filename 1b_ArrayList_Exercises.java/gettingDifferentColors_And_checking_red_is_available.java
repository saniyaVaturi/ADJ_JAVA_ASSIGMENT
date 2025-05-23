/*1b1 Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/

package java_Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class gettingDifferentColors_And_checking_red_is_available {



    public static void main(String[] args) {
        // Initialize an ArrayList to store colors
        List<String> colors = new ArrayList<>();
//adding elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
      //getting different colors
        System.out.println("getting different colors:"+ colors);
        //checking if red is available or not
        System.out.println("is red available:"+colors.contains("Red"));
    }

   
    }

