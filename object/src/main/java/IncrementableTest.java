/**
 * Exercise 7: (1) Turn the Incrementable code fragments into a working program.
 */
class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}

public class IncrementableTest {
    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        System.out.println("StaticTest.i = " + StaticTest.i);
        sf.increment();
        System.out.println("StaticTest.i after increment = " + StaticTest.i);
        Incrementable.increment();
        System.out.println("StaticTest.i after second increment = " + StaticTest.i);
    }
}
