package movies;

import util.Input;

import static movies.MoviesArray.searchedMovieTitle;

public class MoviesApplication {


    public static void main(String[] args) {
        System.out.println("Welcome to the Movie List Application!");
        System.out.println("There are 100 movies in this list.");
        System.out.println("What category are you interested in?");
        System.out.println("0 - exit");
        System.out.println("1 - animated");
        System.out.println("2 - drama");
        System.out.println("3 - horror");
        System.out.println("4 - scifi");
        System.out.println("5 - musical");
        System.out.println("6 - comedy");
        System.out.println("Enter your choice: ");
        int userChoice = Input.getInt(0, 6);
        if (userChoice == 0) {
            System.out.println("Goodbye!");
        } else if (userChoice == 1) {
            System.out.println("Here are all the animated movies:");
            printMovies(MoviesArray.categories("animated"));
        } else if (userChoice == 2) {
            System.out.println("Here are all the drama movies:");
            printMovies(MoviesArray.categories("drama"));
        } else if (userChoice == 3) {
            System.out.println("Here are all the horror movies:");
            printMovies(MoviesArray.categories("horror"));
        } else if (userChoice == 4) {
            System.out.println("Here are all the scifi movies:");
            printMovies(MoviesArray.categories("scifi"));
        } else if (userChoice == 5) {
            System.out.println("Here are all the musical movies:");
            printMovies(MoviesArray.categories("musical"));
        } else if (userChoice == 6) {
            System.out.println("Here are all the comedy movies:");
            printMovies(MoviesArray.categories("comedy"));
        }

        //search movie by title
//        System.out.println("Enter your movie title: ");
//        String userChoice2 = Input.getString();
//        printMovies(searchedMovieTitle(userChoice2));

    }

    public static void printMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }
}
