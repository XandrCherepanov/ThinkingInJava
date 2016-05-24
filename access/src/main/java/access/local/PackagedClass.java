/**
 * Exercise 9: (2) Create two files in the access/local
 * directory (presumably in your CLASSPATH) and in a directory other
 * than access/local. Explain why the compiler generates an error.
 * Would making the Foreign class part of the access.local package change anything?
 */
package access.local;

class PackagedClass {
    public PackagedClass() {
        System.out.println("Creating a packaged class");
    }
}
