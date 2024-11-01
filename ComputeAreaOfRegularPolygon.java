//Exercise 4.5

import java.util.Scanner;

public class ComputeAreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides for a regular polygon: ");
        int n = input.nextInt();

        System.out.print("Enter the length of a side for the polygon: ");
        double s = input.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the polygon is " + area);
    }
}
