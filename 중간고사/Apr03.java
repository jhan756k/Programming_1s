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

        2차원 배열에서 각 1차원 배열들은 순서 상관 없이 JVM메모리 아무데나 생성됨
        메모리 할당은 장영재가 올린 사진

        2차원 배열은 2번 레퍼런스하는 반면 1차원 배열은 1번 레퍼런스함
        따라서 대입 연산자 X
        하지만 2차원 배열의 각 1차원 배열들은 1차원 배열이므로 대입 연산자 가능
        
        ex)
        a가 2차원 배열이고 b가 1차원 배열일 때
        b = a[0];
        --> b[0] == a[0][0]; (true)
        */

        int [][] arr = new int [2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        printArray(arr);

        int [][] arr2 = new int[3][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[1][1] = 3;
        arr2[2][0] = 4;
        arr2[2][1] = 5;
        arr2[2][2] = 6;

        printArray(arr2);
    }

    public static void printArray(int [][] arr) {
        for (int x=0; x<arr.length; x++) {
            for (int y=0; y<arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
