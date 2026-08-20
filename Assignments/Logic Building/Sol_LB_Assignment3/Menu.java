import java.util.Scanner;

public class Menu{

	byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    Boolean h;
	
	
	static void GES(){

        int m1 = 80;
        int m2 = 85;
        int m3 = 90;

        int totalMarks = m1 + m2 + m3;
        int avgMarks = totalMarks / 3;

        System.out.println("Average Marks:" + avgMarks);

        if (avgMarks >= 90) {
            System.out.println("Grade: A");
        } else if (avgMarks >= 80) {
            System.out.println("Grade: B");
        } else if (avgMarks >= 70) {
            System.out.println("Grade: C");
        } else if (avgMarks >= 60) {
            System.out.println("Grad: D");
        } else {
            System.out.println("Fail");
        }

    }
	
	static void checkLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + "is a leap year");
        } else
            System.out.println(year + "is not a leap year");

    }
	
	
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
	
	static void Value() {

        Menu obj = new Menu();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println(obj.e);
        System.out.println(obj.f);
        System.out.println(obj.g);
        System.out.println(obj.h);
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the Menu
            System.out.println("\n=======================================");
            System.out.println("              MAIN MENU              ");
            System.out.println("=======================================");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Problem 1: Grade Evaluation System ---");
                    GES();
                    break;

                case 2:
                    int year2 = 1900;
					checkLeap(year2);
                    break;

                case 3:
                    System.out.println("\n--- Problem 3: Day of the Week ---");
                     int Dayno1 = 5;
					System.out.println(whichday(Dayno1));

					int Dayno2 = 9;
					System.out.println(whichday(Dayno2));
                    break;

                case 4:
                    System.out.println("\n--- Problem 4: Identify Default Values of Variables ---");
                    Value();
                    break;

                case 5:
                    System.out.println("\nExiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select a valid option from the menu.");
            }
        } while (choice != 5);

        scanner.close(); // Prevent memory leaks
    }
}	