package Week03ConditionalsLoopsMethods.projects.NumberGuessingGame;

import javax.swing.text.MaskFormatter;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain;

        do {
            playGame(scanner);
            playAgain = askToPlayAgain(scanner);
        } while (playAgain);

        System.out.println("Gracias por jugar. Bye!");
        scanner.close();
    }

    public static void playGame(Scanner scanner) {
        int secretNumber = generateSecretNumber();
        int attempts = 0;
        boolean hasWon = false;
        showWelcomeMessage();

        while (attempts < MAX_ATTEMPTS && !hasWon) {
            int userGuess = askForGuess(scanner);
            attempts++;

            if (userGuess == secretNumber) {
                hasWon = true;
                showWinMessage(attempts);
            } else {
                showHint(userGuess, secretNumber);
                showRemainingAttempts(attempts);
            }
        }

        if (!hasWon) {
            showLoseMessage(secretNumber);
        }
    }

    public static  int generateSecretNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    public static void showWelcomeMessage() {
        System.out.println("=================================");
        System.out.println("Juego: Adivina el número secreto");
        System.out.println("=================================");
        System.out.println("Estoy pensando en un número entre " + MIN_NUMBER + " y " + MAX_NUMBER);
        System.out.println("Tienes " + MAX_ATTEMPTS + " intentos");
    }

    public static int askForGuess(Scanner scanner) {
        System.out.print("Ingresa tu número: ");
        return scanner.nextInt();
    }

    public static void showHint(int userGuess, int secretNumber) {
        System.out.println();
        if (userGuess > secretNumber) {
            System.out.println("Muy alto. Intenta con un número menor");
        } else {
            System.out.println("Muy bajo. Intenta con un número mayor");
        }
    }

    public static void showRemainingAttempts(int attempts) {
        int remainingAttempts = MAX_ATTEMPTS - attempts;

        if (remainingAttempts > 0) {
            System.out.println("Intentos restantes: " + remainingAttempts);
        }
    }

    public static void showWinMessage(int attempts) {
        System.out.println();
        System.out.println("Correcto! Adivinaste el número");
        System.out.println("Lo lograste en " + attempts + " intento(s)");
    }

    public static void showLoseMessage(int secretNumber) {
        System.out.println();
        System.out.println("Perdiste. Se acabaron los intentos");
        System.out.println("El número secreto era: " + secretNumber);
    }

    public static boolean askToPlayAgain(Scanner scanner) {
        System.out.println();
        System.out.print("Quieres jugar de nuevo? (s/n): ");
        String answer = scanner.next();

        return answer.equalsIgnoreCase("s");
    }
}
