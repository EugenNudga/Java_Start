package fibonacci;

public final class Fibonacci {
    private Fibonacci() {
    }

    public static long getFibonacci(int count) {
        int n1 = 0;
        int n2 = 1;
        int n3 = n2 + n1;
        if (count == 0) {
            return 0;
        }

        for (int i = 2; i <= count; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static long getRecursionFibonacci(int count) {
        //в рекурсии циклов нету
        //f(n) = f(n-1) + f(n-2)
        //рекрсия сама разварачивается в цикл или циклы
        return (count == 0 || count == 1) ? count
                // fibonacci(n-1)+fibonacci(n-2)
                : getRecursionFibonacci(count - 1) + getRecursionFibonacci(count - 2);
    }
}
