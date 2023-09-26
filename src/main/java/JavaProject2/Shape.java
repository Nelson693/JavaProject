package JavaProject2;

public class Shape {


    /*Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */

    public interface shape {
        double calculateArea();
        double calculatePerimeter();

    }

    class square implements shape {
        double radius;

        public square(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            double area=3.14 *radius*radius;
            return area;
        }

        @Override
        public double calculatePerimeter() {
            double perimeter=2*3.14*radius;
            return perimeter;
        }
    }

    class circle implements shape {
        double side;

        public circle(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            double area = side * side;
            return area;
        }

        @Override
        public double calculatePerimeter() {
            double perimeter = 4 * side;
            return perimeter;
        }


        public void main(String[] args) {
            square circle= new square(5.0);
            System.out.println("Square area: "+ circle.calculateArea());
            System.out.println("Square perimeter: "+circle.calculatePerimeter());

            JavaProject2.Shape.circle square= new circle(6.0);
            System.out.println("Circle area: "+ square.calculateArea());
            System.out.println("Circle perimeter: "+square.calculatePerimeter());

        }

    }
}
