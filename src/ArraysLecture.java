import java.util.Arrays;

public class ArraysLecture {
    /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).Find the sum of all five double values using an enhanced for loop.
     */
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println("this is the sum of the first example: " +sum);

        double[] numbers2 = new double[5];
        numbers2[0] = 1.0;
        numbers2[1] = 2.0;
        numbers2[2] = 3.0;
        numbers2[3] = 4.0;
        numbers2[4] = 5.0;
        double sum2 = 0;
        for (double number : numbers2) {
            sum2 += number;
        }
        System.out.println("this is the sum of the second example: " + sum2);
        System.out.println(Arrays.toString(numbers));

    }
}
