package shapes;

public class Square extends Rectangle {
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea2() {
//        return length * width;
//    }
//
//    public int getPerimeter2() {
//        return 4 * length;
//    }


        protected int side;
        public Square(int side) {
            super(side, side);
            this.side = side;
        }

        public int getArea2() {
            return side * side;
        }

        public int getPerimeter2() {
            return 4 * side;
        }
    }


