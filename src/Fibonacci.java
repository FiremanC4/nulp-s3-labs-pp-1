import java.lang.Math;

public class Fibonacci {
    int N_;
    long fib_;
    boolean great;


    public Fibonacci(int N) {
        N_ = N;
        calculate();
        great = Math.pow(1.75, N) < fib_;
    }

    /* Calculating fibonacci and caching into private variables */
    void calculate() {
            int a, b, c;
            a = b = 1;
            for (int i = 1; i < N_; i++) {
                c = b;
                b = a + b;
                a = c;
            }
            fib_ = b;

    }

    void output() {
        System.out.println("Fib(" + N_ + ") = " + fib_ + ", and it is " + (great ? "greater" : "fewer") + " than 1.75^" + N_);
    }
}
