class armstrong {

    // Method to count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Method to calculate power a^b
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + power(digit, digits);
            n = n / 10;
        }

        return sum == original;
    }

    // Main method
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Armstrong numbers between 100 and 10000:");

        for (int i = 100; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total count = " + count);
    }
}
