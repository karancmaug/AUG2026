public class GradeEvalutionSystem {

    public static void main(String args[]) {

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
}