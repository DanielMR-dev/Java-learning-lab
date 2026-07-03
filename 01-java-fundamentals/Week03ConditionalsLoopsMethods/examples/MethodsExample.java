package Week03ConditionalsLoopsMethods.examples;

public class MethodsExample {
    public static void main(String[] args) {
        greet("Daniel");

        int result = add(10, 13);
        System.out.println("Result: " + result);

        System.out.println("Es mayor de edad? " + isAdult(23));
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}
