package factorial;

import java.math.BigInteger;

//так как єто утилитній класс (класс с статикой). Мы не предполагаем создавать объекты
//final класс нельзя наследовать
public final class Factorial {

    private Factorial() {
    }

    public static BigInteger getFactorial(int number) {
        //int i; //теперь для i не нужна видимость за пределами цикла for
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        //плохо. ибо лучше возратить число. И там решать что с ним делать(вывод в консоль, файл, пердача в метод...)
//        System.out.println("Factorial of " + number + " is: " + fact);
        return fact;
    }

    //example 5!=5*4!=5*4*3!=5*4*3*2!=5*4*3*2*1!=5*4*3*2*1=120
    //factorial(5)=5*factorial(4)=....
    //так же нужно услвоие выхода из рекурсии
    public static BigInteger getRecursionFactorial(int number) {
        //TODO: implement
        // by definition 0!=1
        return number == 0 ? BigInteger.ONE :
                //1*factorial(1-1)=1*factorial(0)=1*1
                BigInteger.valueOf(number).multiply(getRecursionFactorial(number - 1));
    }
}
