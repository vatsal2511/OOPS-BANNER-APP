/**
 * OOPS Banner App - Use Case 5
 * Optimizing code with combined Array Declaration and Initialization.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {
    public static void main(String[] args) {
        // UC5: Combining declaration and initialization for cleaner code
        String[] bannerLines = {
            String.join("", "  *** ", " *** ", " **** ", " **** "),
            String.join("", " * * ", "* * ", "* ", "* "),
            String.join("", " * * ", "* * ", "**** ", "**** "),
            String.join("", " * * ", "* * ", "* ", "   * "),
            String.join("", "  *** ", " *** ", "* ", "**** ")
        };

        // UC5: Efficiently iterating through the array using an enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}