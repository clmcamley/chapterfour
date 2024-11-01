//Exercise 4.17

import java.util.Scanner;

public class CalculateNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit year: ");
        int year = input.nextInt();
        System.out.print("Enter a three-letter month (ex. Jan): ");
        String month = input.next();

        if (Character.isUpperCase(month.charAt(0)) && Character.isLowerCase(month.charAt(1)) && Character.isLowerCase(month.charAt(2))) {
            int daysInMonth = 30;
            switch (month) {
                case "Jan":
                case "Mar":
                case "May":
                case "Jul":
                case "Aug":
                case "Oct":
                case "Dec": daysInMonth += 1;
                            break;
                case "Feb": if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            daysInMonth -= 1;
                            } else {
                            daysInMonth -= 2;
                            }
                            break;
                case "Apr":
                case "Jun":
                case "Sep":
                case "Nov": break;
                }
                System.out.println(month + " " + year + " has " + daysInMonth + " days");
        } else {
            System.out.println(month + " is not a correct month name");
        }
    }
}
