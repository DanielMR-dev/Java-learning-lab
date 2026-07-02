package exercises;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu año de nacimiento: ");
        int birthYear = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("Tu edad aproximada es: " + age);

        scanner.close();
    }
}
