package lesson1;

public class BitOperation {
    public static void main(String[] args) {
        int a = 10;// в двоичной системе можешь написать? 0110
        //10/2=5
        //5/2=2.5
        //2/2=1
        //1/2 = 0.5
        //0/2=0
        //
        int b = 3; // 0011

        int result1 = a | b;//? 0110 | 0011 = 0111
        System.out.println(result1);
        //0101 | 0011 = 0111
        int result2 = a & b;//? 0110 & 0011 = 0010
        System.out.println(result2);
        int result3 = ~a; //~(0000 0110) = (1111 1001) (
        System.out.println(result3);
        //https://www.vojtechruzicka.com/bit-manipulation-java-bitwise-bit-shift-operations/

        int c = 16;// в двоичной системе 0001 0000
        int result4 = c << 2;// сдвиг влево
        System.out.println(result4); //0100 0000 в десятичной системе?-> 64
        int result5 = c >> 3; //0000 0010 = 2 сдвиг вправо
        System.out.println(result5);
        int result6 = -1 >>> 2;// беззнаковый сдвиг
        // -1 -> в двоичной системе 0000 0001
        // 1111>>2 ->1001 знаковый бит остается
        // 1111>>>2 ->0001 занковый бит замещается 0

    }
}
