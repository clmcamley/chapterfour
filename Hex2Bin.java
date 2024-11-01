//Exercise 4.12

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();
        int decimal = 0;
        int binary = 0;

        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character.");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            decimal = ch - 'A' + 10;
        } else if (Character.isDigit(ch)) {
            decimal = Integer.parseInt(hexString);
        } else {
            System.out.println(ch + " is an invalid input");
        }

        if ((decimal / 8) == 1) {
            binary += 1000;
            decimal %= 8;
        }
        if ((decimal / 4) == 1) {
            binary += 100;
            decimal %= 4;
        }
        if ((decimal / 2) == 1) {
            binary += 10;
            decimal %= 2;
        }
        if (decimal == 1) {
            binary += 1;
        }

        String binString = "0" + binary;

        if (binString.length() < 5) {
            binString = "0" + binString;
        }

        if (binString.length() < 5) {
            binString = "0" + binString;
        }

        if (binString.length() < 5) {
            binString = "0" + binString;
        }

        System.out.printf("The binary is %s", binString);
    }
}