package main;

import java.util.Scanner;

public class methodEx {

    static void myFunc() {
        System.out.println("Hello, I'm from inside of a function.");
    }

    static void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    static void divisors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    static int subtract(int x, int y) {
        int result = x - y;
        return result;
    }

    static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    static int divide(int x, int y) {
        int result = x / y;
        return result;
    }

    public static void main(String[] args) {

        int x, y;

        System.out.println("Please enter the value of x and y: ");

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        myFunc();

        evenOrOdd(x);

        divisors(x);

        int r1 = add(x, y);
        System.out.println("Addition: " + r1);

        int r2 = subtract(x, y);
        System.out.println("Subtraction: " + r2);

        int r3 = multiply(x, y);
        System.out.println("Multiplication: " + r3);

        int r4 = divide(x, y);
        System.out.println("Division: " + r4);

        sc.close();
    }
}
