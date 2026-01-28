 class pattern4 {
    public static void main(String args[])
    {
        int n=5;
        for(int i =1;i<=n;i++)
        {
            //spaces print
            for(int j=1;j<=n-1;j++)
            {
             System.out.println(" ");
            }
            //star print
           for (int j=1;j<=n;j++) 
           {
            System.out.print("*");
            }
        }
              System.out.println();
    }
}
