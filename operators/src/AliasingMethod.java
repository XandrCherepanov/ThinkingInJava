/**
 * Exercise 3: (1) Create a class containing a float
 * and use it to demonstrate aliasing during method calls.
 */

import static net.mindview.util.Print.*;

class Rectangle {
    float area;
}

public class AliasingMethod {
    static void changeArea(Rectangle rectangle) {
        rectangle.area = 9.4f;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area = 3.3f;
        print("1: r.area: " + r.area);
        changeArea(r);
        print("2: r.area: " + r.area);
    }
}
