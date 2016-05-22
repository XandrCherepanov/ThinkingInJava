/**
 * Exercise 4: (2) Show that protected methods have package
 * access but are not public.
 */
import cookie.Cookie;

public class CookieOutPackageTest {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
//!        cookie.bite();  // not public
    }
}
