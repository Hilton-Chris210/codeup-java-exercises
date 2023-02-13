import java.sql.SQLOutput;

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

    public static int multrec(int input1, int input2){
        for (int i = 0; i < input2; i += 1){

        }
    }

    public static void main (String[] args){
        System.out.println(add(1,1));
        System.out.println(sub(1,1));
        System.out.println(mult(1,1));
        System.out.println(divide(10,0));
        System.out.println(modulous(5,2));
    }
}
