public class Apr10_mabangzin {
    public static void main(String[] args) {
        int n = 3;
        int board [][] = new int [n][n];
        int x = 0;
        int y = n/2;

        for (int i=1; i<=n*n; i++){
            board[x][y] = i;
            if (x-1 < 0 && y+1 >= n){
                x++;
            } else if (x-1 < 0){
                x = n-1;
                y++;
            } else if (y+1 >= n){
                x--;
                y = 0;
            } else if (board[x-1][y+1] != 0){
                x++;
            } else {
                x--;
                y++;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
