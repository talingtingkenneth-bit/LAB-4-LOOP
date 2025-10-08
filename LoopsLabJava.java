/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab.java;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LoopsLabJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n=== Java Loops Laboratory ===");
            System.out.println("1. Multiplication Table Generator (for loop)");
            System.out.println("2. Sum of Natural Numbers (while loop)");
            System.out.println("3. Factorial Calculator (do-while loop)");
            System.out.println("4. Even and Odd Numbers (for loop)");
            System.out.println("5. Reverse Digits of a Number (while loop)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    multiplicationTable(sc);
                case 2 ->
                    sumOfNumbers(sc);
                case 3 ->
                    factorialCalculator(sc);
                case 4 ->
                    evenOddNumbers(sc);
                case 5 ->
                    reverseDigits(sc);
                case 0 ->
                    System.out.println("Exiting... Goodbye!");
                default ->
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    // Activity 1: Multiplication Table Generator (for loop)
    public static void multiplicationTable(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Activity 2: Sum of Natural Numbers (while loop)
    public static void sumOfNumbers(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

    // Activity 3: Factorial Calculator (do-while loop)
    public static void factorialCalculator(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1, i = 1;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println("Factorial = " + fact);
    }

    // Activity 4: Even and Odd Numbers (for loop)
    public static void evenOddNumbers(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Even numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Activity 5: Reverse Digits of a Number (while loop)
    public static void reverseDigits(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed: " + reversed);
    }

}
