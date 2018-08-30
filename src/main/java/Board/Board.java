package Board;

public class Board {
    public static final int black = 1;
    public static final int white = -1;
    public static final int empty = 0;
    public static final int blackQueen = 2;
    public static final int whiteQueen = -2;

    public static int[][] board = new int[][]{
            {empty, black, empty, black, empty, black, empty, black},
            {black, empty, black, empty, black, empty, black, empty},
            {empty, black, empty, black, empty, black, empty, black},
            {empty, empty, empty, empty, empty, empty, empty, empty},
            {empty, empty, empty, empty, empty, empty, empty, empty},
            {white, empty, white, empty, white, empty, white, empty},
            {empty, white, empty, white, empty, white, empty, white},
            {white, empty, white, empty, white, empty, white, empty},
    };
     public int get(int x, int y) {
         return board[x][y];
     }
     //
     public  class Position{
         int x;
         int y;
         int[][] startPos = new int[x][y];
     }
     public static boolean canMove(int x1, int y1, int x2, int y2){
         int startPos = board[x1][y1];
         int finishPos = board[x2][y2];
         if (startPos == 0) return false;
         if (x2 > 8 || y2 > 8) return false;
         if (Math.abs(x2-x1) != Math.abs(y2-y1)) return false;
         if (Math.abs(x2-x1) != 1 && board[x2][y2] !=0) return false;
         else return true;
     }
     public void peekPiece(Position pos){


     }




}
