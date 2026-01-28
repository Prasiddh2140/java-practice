import java.util.*;
public class sum1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of the numbers is "+ sum);
    }
}
