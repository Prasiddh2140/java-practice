import java.util.*;
public class CountWords {
    public static int countWords(String str)
    {
        if(str==null)
        {
            return 0;
        }
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the line");
        String str=sc.nextLine();
        int result=countWords(str);
        System.out.println("The number of words here are"+result);
    }
}
