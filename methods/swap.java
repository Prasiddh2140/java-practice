class swap {
    public static void main(String[] args) {
    swapped(2, 3);
    }

    public static void swapped(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
    }
}
