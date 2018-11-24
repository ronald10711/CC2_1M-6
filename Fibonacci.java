
import java.util.Scanner;


public class Fibonacci {

   
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fib(n));
    }

    static long fib(long n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}