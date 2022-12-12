package task_08;

import java.util.Scanner;

public class InputArray {
    public static int[] GetArray() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter number: ");
                array[i] = scan.nextInt();
            }
            return array;
        }
    }
}
