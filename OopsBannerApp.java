/**
 * OOPS Banner App - Use Case 7
 * Encapsulating patterns within a Class for better organization and scalability.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {

    // UC7: Static Inner Class to encapsulate character patterns
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Initialize objects for each letter
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "});
        CharacterPattern pPattern = new CharacterPattern('P', new String[]{" **** ", " * * ", " **** ", " * ", " * "});
        CharacterPattern sPattern = new CharacterPattern('S', new String[]{"  **** ", " * ", "  *** ", "     * ", " **** "});

        // Build and display banner using object getters
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();
            line.append(oPattern.getPattern()[i]);
            line.append(oPattern.getPattern()[i]);
            line.append(pPattern.getPattern()[i]);
            line.append(sPattern.getPattern()[i]);
            System.out.println(line.toString());
        }
    }
}