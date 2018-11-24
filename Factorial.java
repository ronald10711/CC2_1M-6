import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(number + "!");
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            System.out.print(i + " x ");
            fact = fact * i;

        }
        System.out.println("");
        System.out.println("Factorial of " + number + " is: " + fact);

    }

}