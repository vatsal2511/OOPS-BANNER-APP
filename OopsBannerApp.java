/**
 * OOPS Banner App - Use Case 4
 * Refactoring repetitive print statements into an Array and a Loop.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {
    public static void main(String[] args) {
        // UC4: Using a String Array to store banner lines
        String[] bannerLines = {
            String.join("", "  *** ", " *** ", " **** ", " **** "),
            String.join("", " * * ", "* * ", "* ", "* "),
            String.join("", " * * ", "* * ", "**** ", "**** "),
            String.join("", " * * ", "* * ", "* ", "   * "),
            String.join("", "  *** ", " *** ", "* ", "**** ")
        };

        // UC4: Using an enhanced for-loop for modularity and cleaner output traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}