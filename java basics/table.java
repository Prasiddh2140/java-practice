import java.util.*;
class table
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number whose number is to be written");
    int n=sc.nextInt();
    int product=0;
    System.out.println("Table=");
    for(int i=1;i<=10;i++)
    { 
        product=n*i;
        System.out.println(product);

    }
    }
}