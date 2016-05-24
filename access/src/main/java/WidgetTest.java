/**
 * Exercise 7: (1) Create the library according to the code fragments
 * describing access and Widget. Create a Widget in a class
 * that is not part of the access package.
 */
import access.Widget;

public class WidgetTest {
    public static void main(String[] args) {
        Widget widget = new Widget();
        widget.draw();
    }
}
