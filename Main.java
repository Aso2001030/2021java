package senkan;
public class Main {
    
    static int OCEAN_SIZE = 10;

    public static void main(String[] args) {
        
        printOcean(false);
    }

    private static void printColumnIndexes() {

        System.out.print("  ");
        for (int i = 0; i < OCEAN_SIZE; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
    }

    private static void printBorders() {
        System.out.print(" ");
        for (int j = 0; j < OCEAN_SIZE; j++) {
            System.out.print("+--");
        }
        System.out.println();
    }

    private static void printRows(boolean showShips) {
        for (int i = 0; i < OCEAN_SIZE; i++) {
            // printing row indexes
            System.out.print(i + "|");

            // printing main body
            for (int j = 0; j < OCEAN_SIZE; j++) {
                // Here you can put your ships
                if (showShips) {
                    // print your ship
                    // from your ship map[i][j].
                    // mention that cell size from your 
                    // sample is 2. So it should be something
                    // like this: "* " or " *" etc.
                    // if (map[i][j]) {
                    //     System.out.print("* |");
                    // } else {
                    //     System.out.print("  |");
                    // }
                } else {
                    System.out.print("  |");
                }

            }
            System.out.println();

            // printing extra borders after row filled
            printBorders();
        }
    }

    private static void printOcean(boolean showShips) {
        printColumnIndexes();
        printBorders();
        printRows(showShips);
    }
}