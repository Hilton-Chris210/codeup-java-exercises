package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
            System.out.println("box1.getPerimeter1() = " + box1.getPerimeter());
            System.out.println("box1.getArea1() = " + box1.getArea());

        Square box2 = new Square(5);
            System.out.println("box2.getPerimeter2() = " + box2.getPerimeter());
            System.out.println("box2.getArea2() = " + box2.getArea());
}
}
