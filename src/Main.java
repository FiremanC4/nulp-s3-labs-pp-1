import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib;
        for (int i = 0; i < 5; i++) {
            fib = new Fibonacci(i);
            fib.output();
        }

        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("\nEnter number of fibonacci numbers, -1 to exit\n");
        while (true) {
            n = scan.nextInt();
            if (n == -1) break;

            fib = new Fibonacci(n);
            fib.output();
        }
    }
}
