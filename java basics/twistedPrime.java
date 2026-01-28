
import java.util.*;

class twistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;   // original number
        int rev = 0;
        boolean isPrime = true;
        boolean RevPrime = true;
        // Reverse the number
        while (n != 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }
        // Prime check for original number
        if (temp <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(temp); i++) {
                if (temp % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Prime check for reversed number
        if (rev <= 1)
            RevPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(rev); i++) {
                if (rev % i == 0) {
                    RevPrime = false;
                    break;
                }
            }
        }
        // Final result
        if (isPrime && RevPrime) {
            System.out.println("Yes it is a twisted prime");
        } else {
            System.out.println("Not a twisted prime");
        }
        sc.close();
    }
}
