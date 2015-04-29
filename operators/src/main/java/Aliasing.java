/**
 * Exercise 2: (1) Create a class containing a float
 * and use it to demonstrate aliasing.
 */

import static net.mindview.util.Print.*;

class Circle {
    float area;
}

public class Aliasing {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.area = 4.35f;
        circle2.area = 7.99f;
        print("1: circle1.area: " + circle1.area +
                ", circle2.area: " + circle2.area);
        circle1 = circle2;
        print("2: circle1.area: " + circle1.area +
                ", circle2.area: " + circle2.area);
        circle1.area = 10.9f;
        print("3: circle1.area: " + circle1.area +
                ", circle2.area: " + circle2.area);
    }
}
