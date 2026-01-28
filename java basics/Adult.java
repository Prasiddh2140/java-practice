import java.util.*;
class Adult {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Your are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}

