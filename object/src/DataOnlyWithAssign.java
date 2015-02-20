/**
 * Exercise 5: (1) Modify the previous exercise so
 * that the values of the data in DataOnly are assigned to
 * and printed in main( ).
 */

public class DataOnlyWithAssign {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("data.i = " + data.i);
        System.out.println("data.d = " + data.d);
        System.out.println("data.b = " + data.b);
    }
}
