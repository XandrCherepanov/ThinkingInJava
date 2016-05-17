/**
 * Exercise 16: (1) Create an array of String objects and
 * assign a String to each element. Print the array by using a for loop.
 */
public class StringArray {
    public static void main(String[] args) {
        String[] objects = new String[5];
        objects[0] = "Hello!";
        objects[1] = "This";
        objects[2] = "is";
        objects[3] = "a simple";
        objects[4] = "array";

        for (String elem : objects) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
