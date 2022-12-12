package task_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the array size: ");

            int size = scan.nextInt();
            var array = new int[size];
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter the number: ");
                array[i] = scan.nextInt();
            }
            Calculator calculator = new Calculator();
            System.out.println("The amount of the unwanted numbers:" + calculator.CountUnnecessaryNumbers(array));
        }
    }
}