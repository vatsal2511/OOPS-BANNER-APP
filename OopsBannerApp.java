/**
 * OOPS Banner App - Use Case 3
 * Refactoring string construction using String.join() for better memory efficiency.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {
    public static void main(String[] args) {
        // UC3: Building banner lines using String.join to avoid '+' operator drawbacks
        System.out.println(String.join("", "  *** ", " *** ", " **** ", " **** "));
        System.out.println(String.join("", " * * ", "* * ", "* ", "* "));
        System.out.println(String.join("", " * * ", "* * ", "**** ", "**** "));
        System.out.println(String.join("", " * * ", "* * ", "* ", "   * "));
        System.out.println(String.join("", "  *** ", " *** ", "* ", "**** "));
        
        // Note: In UC3 we continue using sequential print statements but optimize internal string handling.
    }
}