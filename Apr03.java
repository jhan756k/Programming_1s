public class Apr03 {
    public static void main(String[] args) {
        /*
        int b[], c; --> 배열 b와 int c
        int []b, c; --> 배열 b와 배열 c
        따라서 순서에 따라 다른게 생길 수 있음

        이차원 배열
        int [][] arr = new int [3][4];
        int arr [][] = new int [3][4];
        int [] arr [] = new int [3][4]; - 셋다가능

        int [] arr[], x; - arr은 2차원, x는 1차원


        int [][] arr = new int [3][];
        --> c[0], c[1], c[2]
        c[0] = new int [2];
        c[1] = new int [3];
        c[2] = new int [4];
        (만약 전부 4로 길이가 같으면 int [][] arr = new int [3][4]; 가능 3행4열)
        다 다르면 개별적으로 정의해야함
        */

        int [][] arr = new int [2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        
        for (int x=0; x<arr.length; x++) {
            for (int y=0; y<arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
