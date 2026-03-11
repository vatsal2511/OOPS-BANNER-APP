import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - Use Case 8
 * Final Evolution: Using HashMap for centralized pattern management and a dedicated rendering function.
 * @author Vatsal Mundra
 * @version 1.0
 */
public class OopsBannerApp {

    // Centralized Map to store character-to-pattern mappings
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Populating the Pattern Registry
        patternMap.put('O', new String[]{"  *** ", " * * ", " * * ", " * * ", "  *** "});
        patternMap.put('P', new String[]{" **** ", " * * ", " **** ", " * ", " * "});
        patternMap.put('S', new String[]{"  **** ", " * ", "  *** ", "      * ", " **** "});
    }

    public static void main(String[] args) {
        // UC8: Render the banner via a modular function
        renderBanner("OOPS");
    }

    /**
     * assemble and render the final banner using StringBuilder within nested loops.
     */
    public static void renderBanner(String word) {
        int rows = 5; // Number of lines in our ASCII patterns
        
        for (int i = 0; i < rows; i++) {
            StringBuilder lineResult = new StringBuilder();
            for (char c : word.toUpperCase().toCharArray()) {
                if (patternMap.containsKey(c)) {
                    // Efficient pattern retrieval using HashMap
                    lineResult.append(patternMap.get(c)[i]).append("  ");
                }
            }
            System.out.println(lineResult.toString());
        }
    }
}