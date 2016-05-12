/**
 * Exercise 6: (1) Modify the previous exercise so that two of the
 * overloaded methods have two arguments (of two different types), but
 * in reversed order relative to each other. Verify that this works.
 */
public class Dog2 {
    public void bark(String mes, char value) {
        System.out.println("Wow! String: " + mes + " char: " + value);
    }

    public void bark(char value, String mes) {
        System.out.println("Gaf! char: " + value + " String: " + mes);
    }

    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.bark("barking", 's');
        dog.bark('g', "howling");
    }
}
