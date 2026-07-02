package exercises;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas en el mes: ");
        double workedHours = scanner.nextDouble();

        System.out.print("Ingresa el pago por hora: ");
        double hourlyRate = scanner.nextDouble();

        double monthlySalary = workedHours * hourlyRate;
        System.out.println("Salario mensual es: $" + monthlySalary);

        scanner.close();
    }
}
