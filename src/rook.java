import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class rook
{
    private static boolean[][] board;
    private static int[][] placeValue = new int[8][8];

    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("rook.dat"));
        file.nextInt();

        int value = 1;

        for (int y = placeValue.length-1; y >= 0; y--)
            for (int x = 0; x < placeValue[y].length; x++)
                placeValue[y][x] = value++;

        do {
            board = new boolean[8][8];

            for (int i = file.nextInt(); i > 0; i--){
                place(file.nextInt());
            }

            out.println(safe());
        } while (file.hasNextInt());

    }

    private static void place (int position)
    {
        for (int y = placeValue.length-1; y >= 0; y--) {
            for (int x = 0; x < placeValue[y].length; x++) {
                if (placeValue[y][x] == position) {
                    board[y][x] = true;

                    for (int boolY = 0; boolY < placeValue.length; boolY++)
                        board[boolY][x] = true;
                    for (int boolX = 0; boolX < placeValue.length; boolX++)
                        board[y][boolX] = true;
                }
            }
        }
        
    }

    private static String safe()
    {
        int count = 64;
        for (int y = board.length-1; y >= 0; y--) {
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x])
                    count--;
            }
        }

        return "" + count;
    }
}