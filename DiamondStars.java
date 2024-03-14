public class DiamondStars {
    public static void main(String[] args) {
        printDiamond(5);
    }

    public static void printDiamond(int n) {
        int space = n - 1;

        // Print top half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++)
                System.out.print("-");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // Print bottom half of the diamond
        space = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < space; j++)
                System.out.print("-");
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }
}  
    

