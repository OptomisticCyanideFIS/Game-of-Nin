public class Board {
    private static int numPieces = 0;

    //populates board
    public static void populate() {
        numPieces = (int)(Math.random() * 41 + 10);
    }

    //removes pieces
    public static void removePieces(int pointsToRemove) {
        numPieces -= pointsToRemove;
    }

    //method to get number of pieces on the board
    public static int getPieces() {
        return numPieces;
    }

}