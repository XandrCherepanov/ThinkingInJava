/**
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise
 * that takes a String argument and prints it along with your message.
 */
public class OverloadedConstructor {
    public OverloadedConstructor() {
        System.out.println("no-args constructor");
    }

    public OverloadedConstructor(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
        new OverloadedConstructor("constructor message");
    }
}
