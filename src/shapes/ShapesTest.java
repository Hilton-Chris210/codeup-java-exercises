package shapes;

public class ShapesTest {
    public static void main(String[] args) {
       Measurable myShape = new Rectangle(4, 5);
         System.out.println(myShape.getArea());
            System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Square(5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
        }
    }