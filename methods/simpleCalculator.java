import java.util.Scanner;

class SimpleCalculator {
    // Addition
    public static int additionSimple(int x, int y) {
        return x + y;
    }
    // Subtraction (y - x)
    public static int subtractionSimple(int x, int y) {
        return y - x;
    }
    // Multiplication
    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }
    // Division (y / x)
    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) y / x;
    }
    // Remainder
    public static int remainderSimple(int n, int m) {
        if (m == 0) {
            System.out.println("Error: Division by zero in remainder.");
            return 0;
        }
        return n % m;
    }
    // Square Root
    public static double squareRootSimple(int n) {
        if (n < 0) {
            System.out.println("Error: Square root of negative number is not allowed.");
            return 0;
        }
        return Math.sqrt(n);
    }
    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter x and y: ");
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    System.out.println("Result = " + additionSimple(x1, y1));
                    break;

                case 2:
                    System.out.print("Enter x and y: ");
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    System.out.println("Result = " + subtractionSimple(x2, y2));
                    break;

                case 3:
                    System.out.print("Enter x and y: ");
                    int x3 = sc.nextInt();
                    int y3 = sc.nextInt();
                    System.out.println("Result = " + multiplicationSimple(x3, y3));
                    break;

                case 4:
                    System.out.print("Enter x and y: ");
                    int x4 = sc.nextInt();
                    int y4 = sc.nextInt();
                    System.out.println("Result = " + divisionSimple(x4, y4));
                    break;

                case 5:
                    System.out.print("Enter n and m: ");
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    System.out.println("Result = " + remainderSimple(n, m));
                    break;

                case 6:
                    System.out.print("Enter n: ");
                    int num = sc.nextInt();
                    System.out.println("Result = " + squareRootSimple(num));
                    break;

                case 0:
                    System.out.println("Exiting Calculator. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
