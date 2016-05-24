/**
 * Exercise 9: (2) Create two files in the access/local
 * directory (presumably in your CLASSPATH) and in a directory other
 * than access/local. Explain why the compiler generates an error.
 * Would making the Foreign class part of the access.local package change anything?
 */
package access.foreign;
import access.local.*;

public class Foreign {
    public static void main(String[] args) {
        // Error: access.local.PackagedClass is not public in access.local;
        // cannot be accessed from outside package
        //! PackagedClass pc = new PackagedClass();
    }
}
