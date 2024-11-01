//Exercise 4.1

import java.util.Scanner;

public class ComputePentagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center of the pentagon to an edge: ");
        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        area = Math.ceil(area * 100) / 100;

        System.out.println("The area of a pentagon with length " + length + " is " + area);
    }
}
