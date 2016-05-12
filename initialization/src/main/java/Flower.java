/**
 * Exercise 9: (1) Create a class with two (overloaded) constructors.
 * Using this, call the second constructor inside the first one.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petalCount, String s) {
        this.petalCount = petalCount;
        this.s = s;
        System.out.println("int & String args");
    }

    Flower() {
        this(42, "Hi!");
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }
}
