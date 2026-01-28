public class days {

    public static int numberOfDaysInAYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {

        System.out.println("Year  Days");

        for (int i = 2000; i <= 2020; i++) {
            int days = numberOfDaysInAYear(i);
            System.out.println(i + "   " + days);
        }
    }
}
