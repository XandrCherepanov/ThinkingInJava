/**
 * Exercise 4: (2) Show that protected methods have package
 * access but are not public.
 */
package cookie;

public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructor");
    }

    protected void bite() {
        System.out.println("bite");
    }
}
