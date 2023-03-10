import java.util.Arrays;

public class Person {


    // variables
    private String nameOfPerson;
    private int ageOfPerson;


    public Person(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }


    //getters and setters

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    public void printSummary() {
        System.out.printf("name: %s %nAge: %d %n", nameOfPerson, ageOfPerson);
    }


    public static Person[] addPerson(Person[] people, Person person){
        //add a person to a new array that holds all the people from the new array
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = person;
        return newPeopleArray;
    }


    public static void main(String[] args) {
        Person person1 = new Person("chris", 34);
        Person person2 = new Person("brandon", 36);


        person1.printSummary();
        person2.printSummary();


        System.out.println(person2.getAgeOfPerson());



    }

}

