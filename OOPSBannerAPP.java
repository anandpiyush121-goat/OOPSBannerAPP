import java.util.HashMap;

public class OOPSBannerAPP {

    // Method to create and return patterns
    public static HashMap<Character, String[]> createPatterns() {
        HashMap<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return map;
    }

    // Method to display banner
    public static void displayBanner(String text, HashMap<Character, String[]> map) {
        int height = 5; // Number of rows in each character pattern

        for (int i = 0; i < height; i++) { // Outer loop for rows
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < text.length(); j++) { // Inner loop for characters
                char ch = text.charAt(j);

                if (map.containsKey(ch)) {
                    line.append(map.get(ch)[i]).append("  ");
                } else {
                    line.append("       "); // Space for unknown characters
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> patterns = createPatterns();

        String message = "OOPS";

        displayBanner(message, patterns);
    }
}