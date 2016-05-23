/**
 * Exercise 5: (2) Create a class with public, private, protected,
 * and package-access fields and method members. Create an object of this
 * class and see what kind of compiler messages you get when you try to
 * access all the class members. Be aware that classes in the same directory
 * are part of the “default” package.
 */
public class AccessMembers {
    public int publicField = 1;
    int packageField = 2;
    protected int protectedField = 3;
    private int privateField = 5;

    public void publicMethod() {
        System.out.println("public method called");
    }
    void packageMethod() {
        System.out.println("package method called");
    }
    protected void protectedMethod() {
        System.out.println("protected method called");
    }
    private void privateMethod() {
        System.out.println("private method called");
    }
}
