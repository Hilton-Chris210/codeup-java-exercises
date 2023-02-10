import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//todo Create an integer variable i with a value of 5. Create a while loop that runs so long as i is less than or equal to 15
// Each loop iteration, output the current value of i, then increment i by one.
// Your output should look like this:
// 5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15){
//          System.out.println(i);
//            i+=1;
//        }

//todo Do While
// Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
// Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//        System.out.println(i);
//            i-= 5;
//
//        } while (i >= -10);

//todo Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//            long i = 2;
//            do {
//                System.out.println(i);
//                i *= i;
//            } while (i < 1_000_000);

//        2
//        4
//        16
//        256
//        65536
//todo Refactor the previous two exercises to use a for loop instead.

//        for(int i = 0; i<=100; i++){
//            if (i % 2 ==1){
//                continue;
//            }
//            System.out.println(i);
//        }

//        for(long i = 2; i<=1000000; i*=i){
//            System.out.println(i);
//        }


//todo Fizzbuzz One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
// Write a program that prints the numbers from 1 to 100.
// For multiples of three: print “Fizz” instead of the number.
// For the multiples of five: print “Buzz”.
// For numbers which are multiples of both three and five: print “FizzBuzz”.

//
//        for(int i = 1; i<=100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + "FizzBuzz");
//
//            } else if (i % 3 == 0) {
//                System.out.println(i + "Fizz");
//
//            } else if (i % 5 == 0){
//                System.out.println(i + "Buzz");
//
//            } else{
//                System.out.println(i);
//            }
//        }

//todo Display a table of powers.
// Prompt the user to enter an integer.
// Display a table of squares and cubes from 1 to the value entered.
// Ask if the user wants to continue.
// Assume that the user will enter valid data.
// Only continue if the user agrees to.
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to?: ");
//        int userInput = Integer.parseInt(scanner.next());
//        System.out.print("""
//                Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                """);
//        for(int i = 1; i <= userInput; i++){
//            System.out.printf("%-7d|%-9d|%-7d\n", i ,i*i, i*i*i);
//        }


//todo Convert given number grades into letter grades.
//Prompt the user for a numerical grade from 0 to 100.
//Display the corresponding letter grade.
//Prompt the user to continue.
//Assume that the user will enter valid integers for the grades.
//The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What grade did you receive 0-100?: ");
//        int userInput = Integer.parseInt(scanner.next());
//        if(userInput <=100 && userInput >= 88){
//            System.out.println("Your Grade is: A");
//        } else if(userInput <=87 && userInput >= 80){
//            System.out.println("Your Grade is: B");
//        }else if(userInput <=79 && userInput >= 67){
//            System.out.println("Your Grade is: C");
//        }else if(userInput <=66 && userInput >= 60){
//            System.out.println("Your Grade is: D");
//        }else if(userInput <=59 && userInput >= 0){
//            System.out.println("Your Grade is: F");
//        }



//
//todo        Be creative in communicating with your
//        user different options and for given scenerios. Create at three phases of the chat, for example...
//        "How are you?" (AI says)
//			           |                              |
//        good                        bad (user types)
//        "Awesome! Are you super happy?" 	    "Will cake make you better?"
//        yes          no                     yes             no
//        Keep the chat options relatively simple and plan it out clearly before coding it.
//### Word Guessing Game
//                - prompt a player to enter a word
//        - use a loop to print out several empty lines to hide the answer
//        - allow the user to guess the letters in the word
//                - track the number of letter guesses
//                - display to the user the partially completed word for each correctly guessed character
//        - before prompting the user to guess a letter, give them the option to solve the word
//                - limit the number of guesses based on the length of the word for an extra challenge!

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Want to play a game?! (y/n)");
//        String userInput = scanner.next();
//        if(Objects.equals(userInput, "y")){
//            System.out.println("Ok if you dare....");
//            System.out.println("q?");
//            String userInput2 = scanner.next();
//                if(Objects.equals(userInput2, "y")){
//                    System.out.println("response");
//                    System.out.println("q?");
//                    String userInput3 = scanner.next();
//                        if(Objects.equals(userInput2, "y")) {
//                            System.out.println("response");
//                            System.out.println("q?");
//                            String userInput4 = scanner.next();
//                        }
//                } else if (Objects.equals(userInput, "n")){
//                    System.out.println("oh its far too late to back out now");
//                }
//        } else if (Objects.equals(userInput, "n")){
//            System.out.println("oh its far too late to back out now");
//        }



    }
}