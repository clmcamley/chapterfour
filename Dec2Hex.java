//Exercise 4.11

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int dec = input.nextInt();
        String hexString = "";

        if (dec > 15 || dec < 0) {
            System.out.println("You must enter a decimal value from 0 to 15.");
            System.exit(1);
        }

        if (dec <= 9) {
            hexString = dec + "";
        } else if (10 <= dec) {
            hexString = "A";
            if (dec > 10) {
                char hexChar = hexString.charAt(0);
                hexChar += (dec - 10);
                hexString = "";
                hexString += hexChar;
            }
        } else {
            System.out.println(dec + " is an invalid input");
        }

        System.out.println("The hex value is " + hexString);
    }
}
