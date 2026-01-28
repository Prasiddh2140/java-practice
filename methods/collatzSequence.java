import java.util.*;
public class collatzSequence {
    public static int collatzLength(int n)
    {
    if(n<=0)
    {
        return 0;
    }
    int count=0;
    while(count!=1)
    {
        if(n%2==0)
        {
            n=n/2;
        }
        else
        {
            n=3*n+1;
        
        }
        count++;
    }
    return count;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a positive integer");
    int n=sc.nextInt();
    if(n<=0)
    {
        System.out.println("Please enter a positive number, invalid input");
    }
    else{
        int steps=collatzLength(n);
        System.out.println("Collatz length= "+steps);
    }
}

}