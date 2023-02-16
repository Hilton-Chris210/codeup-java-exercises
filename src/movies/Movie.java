package movies;

// TODO: create a class named Movie
public class Movie {


    //todo fields
    private String name;
    private String category;


    //TODO constructor

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    //TODO getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public static void main(String[] args) {

    }

}
