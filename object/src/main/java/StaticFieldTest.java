/**
 * Exercise 8: (3) Write a program that demonstrates that,
 * no matter how many objects you create of a particular class,
 * there is only one instance of a particular static field in that class.
 */
class StaticField {
    static int field = 42;
}

public class StaticFieldTest {
    public static void main(String[] args) {
        StaticField sf1 = new StaticField();
        StaticField sf2 = new StaticField();
        System.out.println("sf1.field = " + sf1.field);
        System.out.println("sf2.field = " + sf2.field);
        StaticField.field++;
        System.out.println("sf1.field = " + sf1.field);
        System.out.println("sf2.field = " + sf2.field);
    }
}
