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

}
