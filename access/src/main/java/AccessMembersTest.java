/**
 * Exercise 5: (2) Create a class with public, private, protected,
 * and package-access fields and method members. Create an object of this
 * class and see what kind of compiler messages you get when you try to
 * access all the class members. Be aware that classes in the same directory
 * are part of the “default” package.
 */
public class AccessMembersTest {
    public static void main(String[] args) {
        AccessMembers accessMembers = new AccessMembers();
        System.out.println(accessMembers.publicField);
        System.out.println(accessMembers.packageField);
        System.out.println(accessMembers.protectedField);
        // Error: privateField has private access in AccessMembers
        //! System.out.println(accessMembers.privateField);

        accessMembers.publicMethod();
        accessMembers.packageMethod();
        accessMembers.protectedMethod();
        // Error: privateMethod() has private access in AccessMembers
        //! accessMembers.privateMethod();
    }
}
