/**
 * Exercise 8: (2) Create a switch statement that prints a message
 * for each case, and put the switch inside a for loop that
 * tries each case. Put a break after each case and test it,
 * then remove the breaks and see what happens.
 */
import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

public class SwitchTest {
    public static void main(String[] args) {
        for (int i : range(5)) {
            switch (i) {
                case 0:
                    print("The number is one");
                    break;
                case 1:
                    print("The number is two");
                    break;
                case 2:
                    print("The number is three");
                    break;
                case 3:
                    print("The number is four");
                    break;
            }
        }
        print();
        for (int i : range(5)) {
            switch (i) {
                case 0:
                    print("The number is one");
                case 1:
                    print("The number is two");
                case 2:
                    print("The number is three");
                case 3:
                    print("The number is four");
            }
        }
    }
}
