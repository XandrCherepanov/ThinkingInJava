/**
 * Exercise 14: (1) Create a class with a static String field
 * that is initialized at the point of definition, and another one that
 * is initialized by the static block. Add a static method that prints
 * both fields and demonstrates that they are both initialized before they are used.
 */
import static net.mindview.util.Print.print;

public class StaticInit {
    static String var1 = "initialized at the point of definition";
    static String var2;
    static {
        var2 = "initialized in the static block";
    }

    static void printValues() {
        print("var1 = " + var1);
        print("var2 = " + var2);
    }

    public static void main(String[] args) {
        StaticInit.printValues();
    }

}
