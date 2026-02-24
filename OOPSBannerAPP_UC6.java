class Pattern {

    int rows = 7;

    void printPattern() {

        for(int i = 0; i < rows; i++) {

            // First O
            for(int j = 0; j < 6; j++) {
                if((i==0 || i==rows-1) && j>0 && j<5 ||
                   (j==0 || j==5) && i>0 && i<rows-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // Second O
            for(int j = 0; j < 6; j++) {
                if((i==0 || i==rows-1) && j>0 && j<5 ||
                   (j==0 || j==5) && i>0 && i<rows-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // Letter P
            for(int j = 0; j < 6; j++) {
                if(j==0 || i==0 || i==3 || (j==5 && i<3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // Letter S
            for(int j = 0; j < 6; j++) {
                if(i==0 || i==3 || i==rows-1 ||
                   (j==0 && i<3) ||
                   (j==5 && i>3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}

public class OOPSBannerAPP_UC6 {
    public static void main(String[] args) {

        Pattern obj = new Pattern();
        obj.printPattern();

    }
}
