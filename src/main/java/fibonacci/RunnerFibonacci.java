package fibonacci;

import java.util.Scanner;

import static fibonacci.Fibonacci.getFibonacci;
import static fibonacci.Fibonacci.getRecursionFibonacci;

public class RunnerFibonacci {

    public static void main(String args[]) {
        System.out.println("Please, enter a number of a Fibonacci number you would like to see:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        long fibonacci = getFibonacci(count);
        System.out.println("Example without recursion:");
        System.out.println(fibonacci + " ");
        fibonacci = getRecursionFibonacci(count);
        System.out.println("Example with recursion:");
        System.out.print(fibonacci + " ");
    }


}

