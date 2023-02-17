package util;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }
    public Boolean yesNo() {
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }
    public static int getInt(int min, int max) {
        int input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        } else {
            return input;
        }
    }
//    public int getInt() {
//        return scanner.nextInt();
//    }
    public double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        } else {
            return input;
        }
    }
//    public double getDouble() {
//        return scanner.nextDouble();
//    }
}
