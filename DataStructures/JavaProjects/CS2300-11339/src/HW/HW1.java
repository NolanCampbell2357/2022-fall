package HW;

public class HW1 {
    public static void main(String[] args) {
        // displayMonth tests
        displayMonth(31, 1);
        displayMonth(31, 7);
        displayMonth(31, 14);
        displayMonth(28, 4);
        displayMonth(30, 12);
        displayMonth(50, 2);
        displayMonth(0, 4);

        // drawHollowSquareWithSymbol tests
        drawHollowSquareWithSymbol('*', 4);
        drawHollowSquareWithSymbol('$', 5);
        drawHollowSquareWithSymbol('+', 2);
        drawHollowSquareWithSymbol('a', 1);
        drawHollowSquareWithSymbol('b', 0);
        drawHollowSquareWithSymbol('c', 15);
        drawHollowSquareWithSymbol(' ', 5);
    }

    /**
     * Function to display the days of a month formatted by weekdays
     * @param numDays Number of days in the month, should be greater than or equal to 0
     * @param startCol Column corresponding to week day, should be greater than or equal to 1
     */
    private static void displayMonth(int numDays, int startCol) {
        String display = "SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT\n";
        for (int i = 1; i < startCol; i++) {
            display += (i % 7 == 0 ? '\n' : '\t');
        }

        int currentCol = startCol % 7 == 0 ? 7 : startCol % 7;
        for (int i = 1; i <= numDays; i++) {
            display += i;
            if (currentCol >= 7) {
                display += '\n';
                currentCol = 1;
            } else {
                display += '\t';
                currentCol++;
            }
        }
        System.out.println(display);
    }

    /**
     * Function to print a hollow square with a given symbol
     * @param symbol Symbol to print the square with
     * @param size Size of the square in size x size
     */
    private static void drawHollowSquareWithSymbol(char symbol, int size) {
        String square = "";
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                square += (isOnSquarePerimeter(x, y, size) ? symbol : " ") + " ";
            }
            square += '\n';
        }
        System.out.print(square);
    }

    /**
     * Function to test if a given position on a square is on the perimeter
     * @param x x Position of the square
     * @param y y position of the square
     * @param size Size of the square in size x size
     * @return True if the given position is on the perimeter
     */
    private static boolean isOnSquarePerimeter(int x, int y, int size) {
        return (((x == 1) || (x == size)) || ((y == 1) || (y == size)));
    }
}
