import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("chris", 34);
        people[1] = new Person("brandon",   36);
        people[2] = new Person("james", 38);
        for (Person person : people) {
            System.out.println(person.getNameOfPerson());
        }

        Person[] people2 = Arrays.copyOf(people, 4);
        people2[3] = new Person("joe", 40);
        for (Person person : people2) {
            System.out.println(person.getNameOfPerson());
        }

        Person[] people3 = Person.addPerson(people2, new Person("jim", 42));
        for (Person person : people3) {
            System.out.println(person.getNameOfPerson());
        }

    }
}
