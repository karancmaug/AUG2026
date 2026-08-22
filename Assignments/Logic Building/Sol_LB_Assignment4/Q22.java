public class Q22 {
    public static void main(String[] args) {
        int size = 6;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print '*' for borders (first/last row, first/last column)
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
