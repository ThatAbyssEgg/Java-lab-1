package task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input x: ");
            double x = scan.nextDouble();

            System.out.println("Input y: ");
            double y = scan.nextDouble();

            TopRectangle topRectangle = new TopRectangle();
            BottomRectangle bottomRectangle = new BottomRectangle();

            System.out.println("Result: " + (topRectangle.IsContained(x, y) || bottomRectangle.IsContained(x, y)));
        }
    }
}
