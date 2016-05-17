/**
 * Exercise 15: (1) Create a class with a String that is initialized
 * using instance initialization.
 */
public class InstanceInit {
    String var;

    {
        var = "initialized in the instance block";
    }

    public static void main(String[] args) {
        System.out.println(new InstanceInit().var);
    }
}
