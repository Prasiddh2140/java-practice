import java.util.Scanner;

public class largest {

    public static int largestDigit(int n) {

        int greatest = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit > greatest) {
                greatest = digit;
            }

            n = n / 10;
        }

        return greatest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestIs = largestDigit(n);
        System.out.println("Largest digit = " + largestIs);

        sc.close();
    }
}
