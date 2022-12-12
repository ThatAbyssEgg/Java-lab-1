package task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input x: ");
            double x = scan.nextDouble();

            System.out.println("Input y: ");
            double y = scan.nextDouble();

            double numerator = 1 + Math.pow(Math.sin(x + y), 2);
            double denominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
            double result = numerator / denominator + x;

            System.out.println("Result: " + result);
        }
    }
}