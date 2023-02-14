import java.util.Scanner;

public class MethodsExercises {

    public static int add(int input1, int input2){
        return input1 + input2;
    }

    public static int sub(int input1, int input2){
        return input1 - input2;
    }

    public static int mult(int input1, int input2){
        return input1 * input2;
    }

    public static int divide(int input1, int input2){
        return input1 / input2;
    }

    public static int modulous(int input1, int input2){
        return input1 % input2;
    }

    public static int multiRec(int input1, int input2){
        if (input2 == 1){
            return input1;
        } else {
            return input1 + multiRec(input1, input2 - 1);
        }
    }

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return a greeting message to the user by either their first or first and last name.

    public static String sayName(String name){
        return "Hi " + name;
    }
    public static String sayName(String name, String name2){
        return "Hi " + name + " " + name2;
    }
// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"


// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double input1, double input2){
        return input1 - input2;
    }

    public static double mult(double input1, double input2){
        return input1 * input2;
    }

    public static double divide(double input1, double input2){
        return input1 / input2;
    }

    public static double modulous(double input1, double input2){
        return input1 % input2;
    }

    public static double multiRec(double input1, double input2){
        if (input2 == 1){
            return input1;
        } else {
            return input1 + multiRec(input1, input2 - 1);
        }
    }

    public static boolean ofAge(int i1){
        return i1 >= 21;
    }

public static void  getAge(Scanner sc){
    System.out.println("Enter your age as a number");
    int userInput = sc.nextInt();
    if (ofAge(userInput) == true) {
        System.out.println("You are of age");
    } else {
        System.out.println("You are not of age");
        getAge (sc);
    }
}

public static int getInteger(int min, int max){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between 1 and 10");
    int userInput = sc.nextInt();
    if (userInput >= min && userInput <= max){
        System.out.println("Your number is in range");
        return userInput;
    } else {
        System.out.println("Your number is not in range");
        return getInteger(min, max);
    }
}
    public static int getInteger1(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 6");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max){
            System.out.println("Your number is in range");
            return userInput;
        } else {
            System.out.println("Your number is not in range");
            return getInteger(min, max);
        }
    }

public static long getFactorial(int num){
    if (num == 1) return 1;
    return getFactorial(num -1)* num;
}

public static void promptUser(){
        Scanner sc = new Scanner(System.in);
        String continueMessage;
    System.out.println("welcome to the fracotial calculator");

        do{
            System.out.println("what number should we enter?");
            int userInput = getInteger(1, 10);
            System.out.println("The factorial of " + userInput + " is " + getFactorial(userInput));
            System.out.println("Would you like to enter another number (enter yes or no)");
            continueMessage = sc.nextLine();
        } while(continueMessage.equalsIgnoreCase("yes"));
}

//todo Create an application that simulates dice rolling.Ask the user to enter the number of sides for a pair of dice. Prompt the user to roll the dice. "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.Use static methods to implement the method(s) that generate the random numbers.Use the .random method of the java.lang.Math class to generate random numbers.


    public static int getRandomInt(int min, int max){
        return (int) (Math.random() * ((max - min + 1)) + min);
    }
    public static void rollDice(int sides){
        System.out.println("Welcome to the dice roller");
        System.out.println("How many sides should the dice have? 1-6");
        int noOfSides = getInteger1(1, 6);
        System.out.println("Rolling the dice...");
        System.out.println("The first dice rolled a " + getRandomInt(1, noOfSides));
        System.out.println("The second dice rolled a " + getRandomInt(1, noOfSides));
        System.out.println("Would you like to roll again? (enter yes or no)");
        Scanner sc = new Scanner(System.in);
        String continueMessage = sc.nextLine();
        if (continueMessage.equalsIgnoreCase("yes")){
            rollDice(sides);
        } else {
            System.out.println("Thanks for playing");
        }
    }






    public static void main (String[] args) {
//        System.out.println(add(1,1));
//        System.out.println(sub(1,1));
//        System.out.println(mult(1,1));
//        System.out.println(divide(10,1));
//        System.out.println(modulous(577676767676.00,2));
//        System.out.println(multrec(123423244443453.00,10000));
//        System.out.println(sayName("chris"));
//        System.out.println(sayName("chris", "Hilton"));
//        System.out.println("You are" + " " + ofAge(21) + " " + "years old");
//        Scanner sc = new Scanner(System.in);
//        getAge(sc);
        rollDice(6);




    }
}
