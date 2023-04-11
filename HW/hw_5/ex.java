package HW.hw_5;

public class ex {
    static int[] queens = new int[8];
    public static void main(String[] args) {
        placeQueens(0);
        printBoard();
    }

    public static boolean placeQueens(int row) {
        if (row == 8) return true;
        for (int col = 0; col < 8; col++) {
            if (!canPlace(row, col)) {
                queens[row] = col;
                if (placeQueens(row + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canPlace(int x, int y) {
        for (int i = 0; i < x; i++) {
            int j = queens[i];
            if (j == y || Math.abs(x - i) == Math.abs(y - j)) return true;
        }
        return false;
    }

    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queens[i] == j) System.out.print("X ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
