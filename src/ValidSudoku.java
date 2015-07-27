import java.util.HashSet;

/**
 * Created by WangJQ on 2015/7/20.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board[0] == null)
            return false;

        HashSet<Character> set = new HashSet<Character>();
        int i, j;

        for(i = 0; i < board.length; i++) {
            for(j = 0; j < board[i].length; j++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j]))
                        return false;
                    else
                        set.add(board[i][j]);
                }
            }
            set.clear();
        }

        set.clear();
        for(i = 0; i < board.length; i++) {
            for(j = 0; j < board[i].length; j++) {
                if(board[j][i] != '.') {
                    if(set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);
                }
            }
            set.clear();
        }

        set.clear();
        for(i = 0; i < board.length; i += 3) {
            for(j = 0; j < board[i].length; j += 3) {
                for(int k = 0; k < 9; k++) {
                    int row = i + k / 3;
                    int col = j + k % 3;
                    if (board[row][col] != '.') {
                        if (set.contains(board[row][col]))
                            return false;
                        else
                            set.add(board[row][col]);
                    }
                }
                set.clear();
            }
        }

        return true;
    }
}
