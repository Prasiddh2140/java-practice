import java.util.*;
class marks
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Enter the marks got");
            int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("This is good");
        }
        if(marks>=60 && marks<=89)
        {
            System.out.println("This is also good");
        }
        if(marks<=59)
        {
            System.out.println("This is good as well");
        }
        }
        else if (n==0) 
        {       
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Error");
        }
    }
}