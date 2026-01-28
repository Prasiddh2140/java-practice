import java.util.*;
public class sum2 {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);
    }
    static int sum2()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    System.out.println("Enter another number");
    int b=sc.nextInt();
    int sum1=a+b;
    return sum1;
    }
}
