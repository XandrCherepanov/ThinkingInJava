/**
 * Exercise 17: (2) Create a class with a constructor that takes a
 * String argument. During construction, print the argument.
 * Create an array of object references to this class, but don’t actually
 * create objects to assign into the array. When you run the program, notice
 * whether the initialization messages from the constructor calls are printed.
 */
class Ship {
    String name;

    public Ship(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class ArrayInitialization {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }
}
