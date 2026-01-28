import java.util.*;
public class vowels {
    public static int countVowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count++;
            }
        } 
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.nextLine();
        int ans=countVowels(str);
        System.out.println("The number of times vowels has occured is "+ans);
    }
}
