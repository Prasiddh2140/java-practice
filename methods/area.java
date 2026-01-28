import java.util.*;
public class area {
    public static double area(double side)
    {
        return side*side;
    }
    public static double area(double length, double breadth)
    {
        return length*breadth;
    }
    public static double area(int radius)
    {
        return Math.PI*radius *radius;
    }
    public static double area(double base,double height, boolean triangle)
    {
        return 0.5*base*height;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Area calculator");
            System.out.println("1. Area of square");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Area of circle");
            System.out.println("4. Area of triangle");
            System.out.println("5. Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter side");
                    double side=sc.nextDouble();
                    System.out.println("Area of square"+ area(side));
                    break;
                    case 2:
                    System.out.println(" Enter length and breadth");
                    double length=sc.nextDouble();
                    double breadth=sc.nextDouble();
                    System.out.println("Area of rectangle is "+area(length,breadth));
                    break;
                    case 3:
                    System.out.println("Enter radius");
                    double radius=sc.nextDouble();
                    System.out.println("Area of circle is "+area(radius));
                    break;
                    case 4:
                   System.out.println("Enter height and base of triangle");
                   double height=sc.nextDouble();
                   double base=sc.nextDouble();
                   System.out.println("Area of triangle is "+area(base,height,true));
                   break;
                   case 5:
                   System.out.println("Exiting program");
                   break;
                   default:
                   System.out.println(" Invalid choice chose again");
                   break;
                  

            }
           
        }
          while (choice!=5);
    }
}
