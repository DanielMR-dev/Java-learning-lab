package Week03ConditionalsLoopsMethods.exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una contraseña: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
            showPasswordRequirements(password);
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        return hasMinimumLength(password)
                && hasDigit(password)
                && hasUppercase(password)
                && hasLowercase(password);
    }

    public static boolean hasMinimumLength(String password) {
        return password.length() >= 8;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void showPasswordRequirements(String password) {
        if (!hasMinimumLength(password)) System.out.println("- Debe tener al menos 8 caracteres.");
        if (!hasDigit(password)) System.out.println("- Debe contener al menos un número");
        if (!hasUppercase(password)) System.out.println("- Debe contener al menos una letra mayúscula.");
        if (!hasLowercase(password)) System.out.println("- Debe contener al menos una letra minúscula");
    }
}
