package apps;

public class DrawDemo {
    public static void main(String[] args) {
        drawHollowSquareWithSymbol('*', 4);
        drawHollowSquareWithSymbol('$', 5);
        drawHollowSquareWithSymbol('+', 2);
    }

    public static void drawHollowSquareWithSymbol(char symbol, int size) {
        String square = "";
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                square += (isOnSquarePerimeter(x, y, size) ? symbol : " ") + " ";
            }
            square += '\n';
        }
        System.out.print(square);
    }

    public static boolean isOnSquarePerimeter(int x, int y, int size) {
        return (((x == 1) || (x == size)) || ((y == 1) || (y == size)));
    }
}
