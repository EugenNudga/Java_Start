package lesson1;

/**
 * primitives
 */

public class Main {

    private static final int M = 1;

    public static void main(String[] args) {
        // целоцисленные byte, short, int, long
        // c плавающей точкой float, double
        // сиволы char
        // логический тип boolean

        final int n = 10;// const

        byte ab = 10; //[-128,127]
        byte bb = 10;// любая операция над байтом превращает результат в int
        byte cb = (byte) (ab + bb);// это явное приведение типов или cast
        byte xb = n;// так как n<127

        xb = M;
        // аналогично для short

        // int into int
        // long into long
        int ai = 10;
        int bi = 10;
        int ci = ai + bi;

        long al = 100000000000L;// в конце l or L

        float af = 10.1f; //10.1F тоже можно

        double ad = 10.1;

        System.out.println(ad);

        double result = ai + ab - ad;

        System.out.println(result);
    }
}
