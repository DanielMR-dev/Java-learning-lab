package Week03ConditionalsLoopsMethods.exercises;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para mostrar su Factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = calculateFactorial(number);
            String expression = buildFactorialExpression(number);

            System.out.println(number + "! = " + expression + " = " + factorial);
        }

        scanner.close();
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

    public static String buildFactorialExpression(int number) {
        if (number == 1) return "1";

        StringBuilder expression = new StringBuilder();

        for (int i = number; i >= 1; i--) {
            expression.append(i);

            if (i > 1) {
                expression.append(" x ");
            }
        }
        return expression.toString();
    }
}
