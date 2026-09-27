import java.util.*;
public class rotateByD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the size by which it has to be rotated");
        int d=sc.nextInt();
        d=d%n;
        int temp[]=new int[d];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
     for(int i=0;i<d;i++)
     {
        temp[i]=arr[i];
     }
     for(int i=d;i<n;i++)
     {
     arr[i-d]=arr[i];
     }
     for(int i=n-d;i<n;i++)
     {
        arr[i]=temp[i-(n-d)];
     }
     for(int i=0;i<n;i++)
     {
     System.out.println(arr[i]+" ");
     }
    }
}
