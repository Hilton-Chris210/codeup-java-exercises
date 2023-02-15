package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a string");
        String userInput = input.getString();
        System.out.println("You entered: " + userInput);

        System.out.println("Please enter yes or no");
        boolean userBoolean = input.yesNo();
        System.out.println("You entered: " + userBoolean);

        System.out.println("Please enter a number between 1 and 10");
        int userInt = input.getInt(1, 10);
        System.out.println("You entered: " + userInt);

        System.out.println("Please enter a decimal number between 1 and 10");
        double userDouble = input.getDouble(1, 10);
        System.out.println("You entered: " + userDouble);
//

    }
}
