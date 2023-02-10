import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//      double pi = 3.14159;
//
//      String message = String.valueOf(System.out.format("The value of pi is approximately %.2f.%n", pi));
//      System.out.println(message);
//
//          Scanner scanner = new Scanner(System.in);
//
//          System.out.print("Enter an integer: ");
//          int userInput = scanner.nextInt();
//
//          System.out.println("You entered: --> \"" + userInput + "\" <--");
////

//              Scanner sc = new Scanner(System.in);
//              System.out.print("Please enter the number of strings you want to enter: ");
                //takes an integer input
//              String[] string = new String [sc.nextInt()];
//              //consuming the <enter> from input above
//              sc.nextLine();
        //      for (int i = 0; i < string.length; i++)
        //        {
        //            string[i] = sc.nextLine();
        //        }
        //        System.out.println("\nYou have entered: ");
        ////for-each loop to print the string
        //        for(String str: string)
        //        {
        //            System.out.println(str);
        //        }


//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter name, age and salary:");
//
//        // String input
//        String name = myObj.nextLine();
//
//        // Numerical input
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//
//        // Output input by user
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Length and width of your room:");

        // String input
        float length = myObj.nextFloat();
        float width = myObj.nextFloat();

        System.out.println("The perimeter of your room is: " + ((length + width)*2) + ", " + "The area of your room is: " + (length * width / 2));
        System.out.println("The area of your room is: " + (length * width / 2));



















    }
}
