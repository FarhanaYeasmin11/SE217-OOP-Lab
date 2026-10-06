package main;
import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        System.out.print("Enter your first name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name);

        scanner.nextLine(); // Clear the leftover newline buffer
        System.out.print("Enter a full sentence: ");
        String line = scanner.nextLine();
        System.out.println("Your sentence: " + line);
        scanner.close();
    }
}
