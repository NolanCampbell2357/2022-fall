package apps;

public class DisplayCalendar {
    public static void main(String[] args) {
        displayMonth(31, 1);
        displayMonth(28, 4);
    }

    public static void displayMonth(int numDays, int startCol) {
        String display = "SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT\n";
        for (int i = 1; i < startCol; i++) {
            display += (i % 7 == 0 ? '\n' : '\t');
        }

        int currentCol = startCol % 7;
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
}
