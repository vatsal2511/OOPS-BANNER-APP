/**
 * OOPS Banner App - Use Case 6
 * Implementing Static Helper Methods for modularity and DRY principles.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {

    public static void main(String[] args) {
        // UC6: Populate the banner by invoking static methods
        String[] bannerLines = {
            String.join("", getO()[0], getO()[0], getP()[0], getS()[0]),
            String.join("", getO()[1], getO()[1], getP()[1], getS()[1]),
            String.join("", getO()[2], getO()[2], getP()[2], getS()[2]),
            String.join("", getO()[3], getO()[3], getP()[3], getS()[3]),
            String.join("", getO()[4], getO()[4], getP()[4], getS()[4])
        };

        // Loop-based rendering system
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Static helper methods to encapsulate ASCII patterns
    public static String[] getO() {
        return new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "};
    }

    public static String[] getP() {
        return new String[]{" **** ", " * * ", " **** ", " * ", " * "};
    }

    public static String[] getS() {
        return new String[]{"  **** ", " * ", "  *** ", "     * ", " **** "};
    }
}