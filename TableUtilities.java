 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String line = " ";
        int elements = 1;
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <= 5; x++) {
                elements = x * i;
                line += " " + elements + " | ";
                if (elements / i == 5) {
                line += " \n ";
                continue;
                }
            }
        }
        return line;
    }

    public static String getLargeMultiplicationTable() {
        String line = "";
        int elements = 1;
        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= 10; x++) {
                elements = x * i;
                line += elements + "|";
                if (elements / i == 10) {
                line += "\n";
                continue;
                }
            }
        }
        return line;
    }

    public static String getMultiplicationTable(int tableSize) {
        String line = " ";
        int elements = 1;
        for (int i = 1; i <= tableSize; i++) {
            for (int x = 1; x <= tableSize; x++) {
                elements = x * i;
                line += " " + elements + " | ";
                if (elements / i == tableSize) {
                line += " \n ";
                continue;
                }
            }
        }
        return line;
    }
}
