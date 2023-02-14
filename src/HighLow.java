import java.util.Scanner;

import static java.lang
        .Integer.getInteger;

public class HighLow {

    //todo You are going to build a high-low guessing game. Create a class named HighLow inside of src. The specs for the game are: Game picks a random number between 1 and 100. Prompts user to guess the number. All user inputs are validated. if user's guess is less than the number, it outputs "HIGHER". If user's guess is more than the number, it outputs "LOWER". If a user guesses the number, the game should declare "GOOD GUESS!
     public static int init(){
         String newvowel = "a";
         int num = 0;
         String sum = newvowel + num;
            System.out.println(sum);
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to the High Low Game");
         System.out.println("Enter a number between 1 and 100");
         int userInput = sc.nextInt();
         if (userInput >= 1 && userInput <= 100){
             System.out.println("Your number is in range");
             return userInput;
         } else {
             System.out.println("Your number is not in range");
             int min = 1;
             int max = 100;
             return getInteger(String.valueOf(min), max);
         }
     }




    public static void main(String[] args) {
        init();




    }
}
