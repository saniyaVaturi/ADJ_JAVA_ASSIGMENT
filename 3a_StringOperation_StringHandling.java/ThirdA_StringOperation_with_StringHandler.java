/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package ThirdQuestion;

public class ThirdA_StringOperation_with_StringHandler {
	 public static void main(String[] args) {
	        // String Creation and Basic Operations
	        System.out.println("--- String Creation and Basic Operations ---");
	        String str1 = "Hello"; // String literal
	        String str2 = new String("World"); // String object
	        System.out.println("str1: " + str1);
	        System.out.println("str2: " + str2);

	        // Length and Character Access
	        System.out.println("\n--- Length and Character Access ---");
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 0 of str1: " + str1.charAt(0));
	        if (!str1.isEmpty()) {
	            System.out.println("str1 is not empty.");
	        }

	        // String Comparison
	        System.out.println("\n--- String Comparison ---");
	        String str3 = "hello";
	        System.out.println("str1.equals(str2): " + str1.equals(str2));
	        System.out.println("str1.equals(str3): " + str1.equals(str3));
	        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // Lexicographical comparison
	        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
	        System.out.println("\"Hello\".compareTo(\"Hi\"): " + "Hello".compareTo("Hi"));

	        // String Searching
	        System.out.println("\n--- String Searching ---");
	        String text = "This is a sample text.";
	        System.out.println("Index of 'is' in text: " + text.indexOf("is"));
	        System.out.println("Last index of 's' in text: " + text.lastIndexOf('s'));
	        System.out.println("Does text contain 'sample'? " + text.contains("sample"));
	        System.out.println("Does text start with 'This'? " + text.startsWith("This"));
	        System.out.println("Does text end with '.'? " + text.endsWith("."));

	        // Substring Operations
	        System.out.println("\n--- Substring Operations ---");
	        String message = "Welcome to Java";
	        System.out.println("Substring of message from index 4: " + message.substring(4));
	        System.out.println("Substring of message from index 0 to 7: " + message.substring(0, 7));

	        // String Modification
	        System.out.println("\n--- String Modification ---");
	        String original = "Programming";
	        System.out.println("Original string: " + original);
	        System.out.println("Uppercase: " + original.toUpperCase());
	        System.out.println("Lowercase: " + original.toLowerCase());
	        System.out.println("Replace 'ing' with 'er': " + original.replace("ing", "er"));
	        System.out.println("Replace all 'r' with 'R': " + original.replaceAll("r", "R"));
	        System.out.println("Replace first 'r' with 'R': " + original.replaceFirst("r", "R"));

	        // Whitespace Handling
	        System.out.println("\n--- Whitespace Handling ---");
	        String spaced = "   Trim me   ";
	        System.out.println("Spaced string: \"" + spaced + "\"");
	        System.out.println("Trimmed string: \"" + spaced.trim() + "\"");

	        // String Concatenation
	        System.out.println("\n--- String Concatenation ---");
	        String firstName = "John";
	        String lastName = "Doe";
	        String fullName1 = firstName + " " + lastName;
	        String fullName2 = firstName.concat(" ").concat(lastName);
	        System.out.println("Concatenation using '+': " + fullName1);
	        System.out.println("Concatenation using concat(): " + fullName2);

	        // String Splitting
	        System.out.println("\n--- String Splitting ---");
	        String csvData = "apple,banana,orange";
	        String[] fruits = csvData.split(",");
	        System.out.println("Splitting \"" + csvData + "\" by ',':");
	        for (String fruit : fruits) {
	            System.out.println("- " + fruit);
	        }

	        String sentence = "This is a sentence with multiple spaces.";
	        String[] words = sentence.split("\\s+"); // Split by one or more whitespace characters
	        System.out.println("\nSplitting \"" + sentence + "\" by whitespace:");
	        for (String word : words) {
	            System.out.println("- " + word);
	        }

	        // StringBuilder Demo
	        System.out.println("\n--- StringBuilder Demo ---");
	        StringBuilder sb = new StringBuilder("Java");
	        System.out.println("Initial StringBuilder: " + sb);
	        sb.append(" Programming");
	        System.out.println("After append(): " + sb);
	        sb.insert(4, " Language");
	        System.out.println("After insert(): " + sb);
	        sb.delete(0, 5);
	        System.out.println("After delete(): " + sb);
	        sb.reverse();
	        System.out.println("After reverse(): " + sb);

	        // String Formatting
	        System.out.println("\n--- String Formatting ---");
	        String formattedString = String.format("Name: %s, Age: %d, Price: %.2f", "Alice", 30, 19.99);
	        System.out.println("Formatted string: " + formattedString);

	        // Validate Email with contains(), startsWith(), and endsWith()
	        System.out.println("\n--- Validate Email ---");
	        String email1 = "test@example.com";
	        String email2 = "@invalid.com";
	        String email3 = "invalid@";
	        String email4 = ".invalid@com";
	        String email5 = "valid@domain.";

	        System.out.println("Validating email: " + email1);
	        validateEmail(email1);
	        System.out.println("\nValidating email: " + email2);
	        validateEmail(email2);
	        System.out.println("\nValidating email: " + email3);
	        validateEmail(email3);
	        System.out.println("\nValidating email: " + email4);
	        validateEmail(email4);
	        System.out.println("\nValidating email: " + email5);
	        validateEmail(email5);
	    }

	    public static void validateEmail(String email) {
	        if (email.contains("@") &&
	            !email.startsWith("@") &&
	            !email.endsWith("@") &&
	            email.contains(".") &&
	            email.indexOf("@") < email.lastIndexOf(".") &&
	            !email.startsWith(".") &&
	            !email.endsWith(".")) {
	            System.out.println("\"" + email + "\" is likely a valid email format (based on simple checks).");
	        } else {
	            System.out.println("\"" + email + "\" is likely an invalid email format (based on simple checks).");
	        }
	    }
	}
