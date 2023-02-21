package mediaEx;

public class Movie extends Media {
    private String director;
    private int runTime;

    public Movie(String title, String category, int year, String director, int runTime) {
        super(title, category, year);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunTime() {
        return runTime;
    }

    @Override
    public void printMedia() {
        System.out.println("Movie Title: " + this.getTitle());
        System.out.println("Movie Category: " + this.getCategory());
        System.out.println("Movie Year: " + this.getYear());
        System.out.println("Movie Director: " + this.getDirector());
        System.out.println("Movie Run Time: " + this.getRunTime());
        System.out.println("Movie Checked Out: " + this.isCheckedOut());
        System.out.println("Movie Times Checked Out: " + this.getTimesCheckedOut());
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix", "Action", 1999, "Wachowski Brothers", 136);
        Movie movie2 = new Movie("The Matrix Reloaded", "Action", 2003, "Wachowski Brothers", 138);
        Movie movie3 = new Movie("The Matrix Revolutions", "Action", 2003, "Wachowski Brothers", 129);
        movie1.printMedia();
        movie2.printMedia();
        movie3.printMedia();
    }

}

