package task_06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = scan.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; ++i) {
                System.out.print("Enter number: ");
                array[i] = scan.nextInt();
            }
            MatrixTransformer matrixTransformer = new MatrixTransformer();
            int[][] matrix = matrixTransformer.TransformMatrix(array);
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}