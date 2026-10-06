package main;
public class Method {

    public static void printWelcome() {
        System.out.println("Welcome to Java Methods!");
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum (void): " + sum);
    }
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        printWelcome();

        printSum(10, 20);

        int result = addNumbers(15, 25);
        System.out.println("Returned Sum: " + result);

        int testNumber = 8;
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is an even number.");
        } else {
            System.out.println(testNumber + " is an odd number.");
        }
    }
}
