public class Main {
    public static void main(String[] args) {

    }
    static int fibonacci(int n) {
        int a, b, c;
        a = b = 1;
        for (int i = 1; i < n; i++) {
            c = b;
            b = a + b;
            a = c;
        }
        return b;
    }
}
