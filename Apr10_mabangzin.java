public class Apr10_mabangzin {
    public static void main(String[] args) {
        int n = 3;
        int board [][] = new int [n][n];

        int x = 0;
        int y = n/2;
        board[x][y] = 1;

        for (int i=2; i<=n*n; i++){
            
    
            tool.print(board);
        }
    }
}
