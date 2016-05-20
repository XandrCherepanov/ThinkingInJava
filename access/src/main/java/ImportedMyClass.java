/**
 * Exercise 1: (1) Create a class in a package.
 * Create an instance of your class outside of that package.
 */

import mypackage.MyClass;

public class ImportedMyClass {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m);
    }
}
