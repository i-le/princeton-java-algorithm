package week3arrays;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int mine = Integer.parseInt(args[2]);
        boolean[][] array = new boolean[m][n];
        int[][] count = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (mine > 0) {
                    array[i][j] = true;
                    mine--;
                } else {
                    array[i][j] = false;
                }
            }
        }
    }
}
