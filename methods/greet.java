public class greet {
    public static void main(String[] args) {
        String personalised=myGreet( "Prasiddh");
        System.out.println(personalised);
    }
    static String myGreet( String name)
    {
        String a="hello "+name;
        return a;
    }

}
