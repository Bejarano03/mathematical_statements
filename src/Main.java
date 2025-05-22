import java.util.Scanner;

/**
 *
 *
 * @author Marco Bejarano Oseguera
 * @version 5/21/2025
 */

public class Main {

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    public static boolean not(boolean a) {
        return !a;
    }

    public static boolean implication(boolean a, boolean b) {
        return !a || b;
    }

    public static boolean biconditional(boolean a, boolean b) {
        return a == b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Logical Operations Application ===");
        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Evaluate logical operations for custom inputs");
            System.out.println("2. Display full truth table");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                boolean a = getBooleanInput(scanner, "A");
                boolean b = getBooleanInput(scanner, "B");

                System.out.println("\nResults:");
                System.out.println("A AND B: " + and(a, b));
                System.out.println("A OR B: " + or(a, b));
                System.out.println("NOT A: " + not(a));
                System.out.println("NOT B: " + not(b));
                System.out.println("A -> B (Implication): " + implication(a, b));
                System.out.println("A <-> B (Biconditional): " + biconditional(a, b));
            } else if (choice == 2) {
                printTruthTable();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    private static boolean getBooleanInput(Scanner scanner, String varName) {
        while (true) {
            System.out.println("Enter value for " + varName + " (true/false or 1/0): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("true") || input.equals("1")) {
                return true;
            } else if (input.equalsIgnoreCase("false") || input.equals("0")) {
                return false;
            } else {
                System.out.println("Invalid input. Enter true or false or 1/0: .");
            }
        }
    }

    private static void printTruthTable() {
        System.out.println("\nTruth Table:");
        System.out.println("A\tB\tA AND B\tA OR B\tNOT A\tNOT B\tA->B\tA<->B");
        boolean[] values = {false, true};
        for (boolean a : values) {
            for (boolean b : values) {
                System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                        a, b,
                        and(a, b),
                        or(a, b),
                        not(a),
                        not(b),
                        implication(a, b),
                        biconditional(a, b));
            }
        }
    }
}