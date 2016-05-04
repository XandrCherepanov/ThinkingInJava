/**
 * Exercise 14: (3) Write a method that takes two String arguments
 * and uses all the boolean comparisons to compare the two Strings
 * and print the results. For the == and !=, also perform the equals() test.
 * In main(), call your method with some different String objects.
 */
import static net.mindview.util.Print.*;

public class StringComparison {
    public static void stringCompare(String str1, String str2) {
        print(str1 + " == " + str2 + ": " + (str1 == str2));
        print(str1 + ".equals(" + str2 + "): " + str1.equals(str2));
        print(str1 + " != " + str2 + ": " + (str1 != str2));
        print("!" + str1 + ".equals(" + str2 + "): " + !str1.equals(str2));
        //! print(str1 + " < " + str2 + ": " + (str1 < str2));
        //! print(str1 + " <= " + str2 + ": " + (str1 <= str2));
        //! print(str1 + " > " + str2 + ": " + (str1 > str2));
        //! print(str1 + " >= " + str2 + ": " + (str1 >= str2));
        //! print("!" + str1 + ": " + !str1);
        //! print(str1 + " && " + str2 + ": " + (str1 && str2));
        //! print(str1 + " || " + str2 + ": " + (str1 || str2));
        print();
    }

    public static void main(String[] args) {
        stringCompare("Hello", "Hello");
        stringCompare("Hello", "Hi");
    }
}
