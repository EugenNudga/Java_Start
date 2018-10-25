package lesson1;

public class PrimitiveRunner {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "%" + b + "=" + (a % b));//остаток от деления
        //а что так получим?

        System.out.println(a + "/" + b + "=" + ((double) a / b));// это не поможит

        System.out.println("a=" + a++);
        System.out.println("b=" + (++b));
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println( a > (++b));

        //3 -> 4 (++b)сразу становится 4
        //3->4   (b++) сначала используется значение текущее (3), а при следующем вызове  становится 4
        //System.out.println( a == (b++));
        // (3 == 3) => true, a=3, b = 4
        //System.out.println( a == (++b));
        // (3 == 4) => false, a=3, b = 4

    }
}
