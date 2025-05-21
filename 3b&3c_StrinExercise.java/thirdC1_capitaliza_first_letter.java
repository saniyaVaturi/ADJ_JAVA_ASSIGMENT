package thirdC;

public class thirdC1_capitaliza_first_letter {

    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world from java";
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}
