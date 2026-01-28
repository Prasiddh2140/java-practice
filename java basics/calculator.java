import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of the two numbers is: "+sum);
        int product=sc.nextInt();
        System.out.println("Product of the two numbers is: "+(a*b));
        if(a>b)
        {
            int remainder=a%b;
            System.out.println("Remainder of the two numbers is: "+remainder);
            int division=a/b;
            System.out.println("Division of the two numbers is: "+division);
            int diff=a-b;
            System.out.println("Difference of the two numbers is: "+diff);
        }
        else{
            int remainder=b%a;
            System.out.println("Remainder of the two numbers is: "+remainder);
            int divisionn=b/a;
            System.out.println("Division of the two numbers is: "+divisionn);
            int diffrence=b-a;
            System.out.println("Difference of the two numbers is: "+diffrence);
        }

    }
}