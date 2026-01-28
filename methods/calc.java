import java.util.*;
public class calc {
    public static int additionSimple(int x, int y)
    {
        int add=x+y;
        return add;
    }
    public static int subtractionSimple(int x, int y)
    {
        int subtract=x-y;
        return subtract;
    }
    public static int multiplicationSimple(int x, int y)
    {
        int multiplication=x*y;
        return multiplication;
    }
    public static double divisionSimple(int x, int y)
    {
        if(x==0)
        {
             System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        else{
            int divide= y/x;
            return (double)divide;
        }
    }
    public static int remainderSimple(int n, int m)
    {
        int remainder=n%m;
        return remainder;
    }
  public static double squareRootSimple(int n) {
    if (n < 0) {
        System.out.println("Error: Cannot calculate square root of a negative number.");
        return 0;
    }
    return Math.sqrt(n);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("This is your calculator");
            System.out.println("chose 1 for addition");
            System.out.println("chose 2 for subtraction");
            System.out.println("chose 3 for multiplication");
            System.out.println("chose 4 for division");
            System.out.println("chose 5 for remanider");
            System.out.println("chose 6 for square root");
            System.out.println("Enter your choice ");
            choice=sc.nextInt();
            switch (choice)
            {
            case 1:
                 System.out.println("Enter x and y: ");
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    System.out.println("Result = " + additionSimple(x1, y1));
                    break;
            
            case 2:
                System.out.println("Enter x and y: ");
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                System.out.println("Result= "+subtractionSimple(x2,y2));
                break;
                case 3:
                System.out.println("Enter x and y");
                int x3=sc.nextInt();
                int y3=sc.nextInt();
                System.out.println("Result= "+multiplicationSimple(x3,y3));
                break;
                case 4:
                int x4=sc.nextInt();
                int y4=sc.nextInt();
                System.out.println("Result= "+divisionSimple(x4,y4));
                break;
                case 5:
                int x5=sc.nextInt();
                int y5=sc.nextInt();
                System.out.println("Result= "+remainderSimple(x5,y5));
                break;
                case 6:
                int num=sc.nextInt();
                System.out.println("Result= "+squareRootSimple(num));
               break;
               case 0:
               System.out.println("Exiting calculator  goodbye");
               default:
                System.out.println("Invalid option ");
                break;
        }
    }while(choice!=0)  ;
}
}
