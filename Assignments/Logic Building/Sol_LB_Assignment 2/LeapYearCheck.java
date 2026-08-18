
public class LeapYearCheck {

    static void checkLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + "is a leap year");
        } else
            System.out.println(year + "is not a leap year");

    }

    public static void main(String args[]) {
        int year1 = 2024;

        checkLeap(year1);

        int year2 = 1900;
        checkLeap(year2);

        int year3 = 2000;
        checkLeap(year3);

        int year4 = 1200;
        checkLeap(year4);

    }

}
