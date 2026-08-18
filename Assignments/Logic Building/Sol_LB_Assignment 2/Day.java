
public class Day {

    static String whichday(int day) {
        switch (day) {
            case 1:
                return "The day is Monday";
            case 2:
                return "The day is Tuesday";
            case 3:
                return "The day is Wednesday";
            case 4:
                return "The day is Thursday";
            case 5:
                return "The day is Friday";
            case 6:
                return "The day is Saturday";
            case 7:
                return "The day is Sunday";
            default:
                return "Invalid Input";
        }
    }

    public static void main(String args[]) {
        int Dayno1 = 5;
        System.out.println(whichday(Dayno1));

        int Dayno2 = 9;
        System.out.println(whichday(Dayno2));
    }
}
