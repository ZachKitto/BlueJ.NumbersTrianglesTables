 

public class TriangleUtilities {
    
    public static String getRow(int numberOfStars) {
        String asterisk = "";
        for (int i = 0; i < numberOfStars; i++) {
            asterisk += "*";
        }
        return asterisk;
    }
    
    public static String getTriangle(int numberOfRows) {
        String asterisk = "";
        String newLine = "";
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            asterisk += "*";
            newLine = asterisk + "\n";
            triangle += newLine;
        }
        return triangle;
    }


    public static String getSmallTriangle() {
        return "*\n**\n***\n****\n";
    }

    public static String getLargeTriangle() {
        return "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n";
    }
}
