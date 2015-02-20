/**
 * Exercise 6: (2) Write a program that includes and calls the storage( )
 * method defined as a code fragment in this chapter.
 */
public class StringStorage {
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println("Storage for string \"hello\" = " + storage("hello"));
    }
}
