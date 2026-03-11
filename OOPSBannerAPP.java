public class OOPSBannerAPP {

    // Static inner class to store character and its pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "  ****  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**    **",
                " **  ** ",
                "  ****  "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "****** ",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     ",
                "**     "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ******",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                "****** "
        });

        String[] oPattern = O.getPattern();
        String[] pPattern = P.getPattern();
        String[] sPattern = S.getPattern();

        for (int i = 0; i < oPattern.length; i++) {
            StringBuilder line = new StringBuilder();
            line.append(oPattern[i]).append(" ");
            line.append(oPattern[i]).append(" ");
            line.append(pPattern[i]).append(" ");
            line.append(sPattern[i]);

            System.out.println(line);
        }
    }
}