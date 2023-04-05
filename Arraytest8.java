public class Arraytest8 {
    public static void main(String[] args) {
        int n = 6;
        int bombnum = (n*n/3);
        int[][] board = new int[n][n];

        for (int i=0; i<bombnum; i++){
            int x = (int)(Math.random()*n);
            int y = (int)(Math.random()*n);
            if (board[x][y] == 9){
                i--;
                continue;
            }
            board[x][y] = 9;
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (board[i][j] != 9){
                    board[i][j] = getNearBomb(board, i, j);
                }
            }
        }

        tools.print(board);
    }

    public static int getNearBomb(int[][] board, int x, int y){
        int count = 0;
        for (int i=-1; i<=1; i++){
            for (int j=-1; j<=1; j++){
                if (x+i >= 0 && y+j >= 0 && x+i < board.length && y+j < board[0].length){
                    if (board[x+i][y+j] == 9){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}