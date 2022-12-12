package task_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the array size: ");
            int size = scan.nextInt();
            int[] array = new int[size];

            Random random = new Random();
            for (int i = 0; i < size; ++i) {
                array[i] = random.nextInt(100);
            }

            System.out.println("Initial array:" + Arrays.toString(array));

            PrimeChecker primeChecker = new PrimeChecker();
            System.out.println("Indexes of prime numbers: " + primeChecker.getPrimeNumberIndexes(array));
        }
    }
}