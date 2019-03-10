package homework13;

import java.util.Scanner;

public class Main {
    // main and logic should be in separate classes
    public static void main(String[] args) {
        /**
         * Возвести число в квадрат, куб, степень. Важно: не использовать Math.pow().
         */
        //Method  pow doesn't have modifier static. You should create object of class BaseNumberAndItsPower and use it.
        //Hello from Github
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base number:");
        double number = scanner.nextDouble();
        System.out.println("Please enter an exponent number:");
        int exponent = scanner.nextInt();
        BaseNumberAndItsPower baseNumberAndItsPower = new BaseNumberAndItsPower();
        System.out.println("The result is: " + baseNumberAndItsPower.pow(number,exponent));
    }
}
