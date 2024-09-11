import java.lang.Math;

public class Fibonacci {
    int N_, fib_;
    boolean great;

    public Fibonacci(int N) {
        N_ = N;
        calculate();
        great = Math.pow(1.75, N) > fib_;
    }

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
        System.out.println("Fib = " + fib_ + ", and it is" + (great ? "" : " not") + " greater than 1.75^" + N_);
    }
}
