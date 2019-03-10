package homework13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Возвести число в квадрат, куб, степень. Важно: не использовать Math.pow().
         */
        
        //Hello from Github
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base number:");
        int number = scanner.nextInt();
        System.out.println("Please enter an exponent (or a power) number:");
        int power = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < power; i++) {
            result += number;
        }
        System.out.println("The result is: " + result);
    }
}
