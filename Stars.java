import java.util.*;

public class Stars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");

        int noOfRows = N;

        int midRow = (noOfRows - 1);

        int row = 1;

        for (int i = midRow; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            System.out.println();

            row++;
        }
        for (int i = 0; i <= midRow; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

            row--;
        }
    }
}