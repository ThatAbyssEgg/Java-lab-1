package task_07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            var array = new int[size];
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter the number: ");
                array[i] = scan.nextInt();
            }
            System.out.println(Arrays.toString(Sortings.ShellSort(array)));
        }
    }
}