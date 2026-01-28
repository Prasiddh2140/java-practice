import java.util.Scanner;

public class occurence {

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find: ");
        char a = sc.next().charAt(0);

        int result = count(str, a);

        System.out.println(
            "The word is \"" + str + "\", the letter '" + a +
            "' occurs " + result + " times."
        );

        sc.close();
    }
}
