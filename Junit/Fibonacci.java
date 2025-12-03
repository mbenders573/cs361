package cs361.Junit;

public class Fibonacci {
    public static int fib(int n) {
        if (n > 45 || n < 0) {
            throw new IllegalArgumentException("n should be between 0 and 45");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        try {
            System.out.println(fib(20));
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}