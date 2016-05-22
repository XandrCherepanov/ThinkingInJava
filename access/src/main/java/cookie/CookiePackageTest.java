/**
 * Exercise 4: (2) Show that protected methods have package
 * access but are not public.
 */
package cookie;

public class CookiePackageTest {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.bite();  // package access
    }
}
