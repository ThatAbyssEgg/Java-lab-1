package task_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input a: ");
            double a = scan.nextDouble();

            System.out.println("Input b: ");
            double b = scan.nextDouble();

            System.out.println("Input step: ");
            double h = scan.nextDouble();

            while (a <= b) {
                System.out.println("| x = " + String.format("%5.2f", a) + " | tan(x) = "
                        + String.format("%7.3f", Math.tan(a)) + " |");
                a += h;
            }
        }
    }
}