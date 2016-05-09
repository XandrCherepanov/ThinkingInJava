/**
 * Exercise 7: (1) Modify Exercise 1 so that the program exits
 * by using the break keyword at value 99. Try using return instead.
 */
public class OneHundred1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) break;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i == 99) return;
            System.out.print(i + " ");
        }
    }
}
