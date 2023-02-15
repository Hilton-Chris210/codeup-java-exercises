package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a radius");
        String userInput = input.getString();
        double radius = Double.parseDouble(userInput);
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());


    }
}
