import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int number)
    {
    int rev=0;
    int temp=number;
    while(number!=0)
    {
  
    int a=number%10;
    rev=rev*10+a;
    number=number/10;
    }
    return rev==temp;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        boolean ans=isPalindrome( number);
        System.out.println(ans + " Palindromne");
    }
}
