package org.example;
//import java.util.Scanner;
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class SquareCalculator {

//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a number to find it's square: ");
//         int number=scanner.nextInt();
//
//         System.out.println("Square: "+calculateSaqure(number));
//         scanner.close();
//        }
//    }
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Scientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^y)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Square root of a negative number is not real.");
                    } else {
                        System.out.println("√" + num + " = " + Math.sqrt(num));
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Factorial of a negative number is not defined.");
                    } else {
                        System.out.println(n + "! = " + factorial(n));
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnNum = scanner.nextDouble();
                    if (lnNum <= 0) {
                        System.out.println("Logarithm is only defined for positive numbers.");
                    } else {
                        System.out.println("ln(" + lnNum + ") = " + Math.log(lnNum));
                    }
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

