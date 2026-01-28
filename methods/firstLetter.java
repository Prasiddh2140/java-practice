import java.util.Scanner;
public class firstLetter{
    // Method to convert string to title case
    public static String toTitleCase(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }
        // Add a space at the beginning
        str = " " + str;
        String result = "";
        // Start from index 1 because index 0 is the added space
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            // If previous character is space, capitalize current
            if (previous == ' ') {
                result += Character.toUpperCase(current);
            } else {
                result += current;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = toTitleCase(input);
        System.out.println("Title Case: " + output);
        sc.close();
    }
}
