package factorial;

import java.util.Scanner;

import static factorial.Factorial.getFactorial;
import static factorial.Factorial.getRecursionFactorial;

public class RunnerFactorial {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any number you want for calculating its factorial:");
        int number = scanner.nextInt();

        System.out.println("Example without recursion:");
        System.out.println("Factorial of " + number + " is: " + getFactorial(number));
        System.out.println("Example with recursion:");
        System.out.println("Factorial of " + number + " is: " + getRecursionFactorial(number));

    }
}

