import java.util.Arrays;

public class Apr07 {
    public static void main(String[] args) {
        /*
        2차원 배열 Sort
        역행렬구현

        마인배열
        */

        int [][] arr = new int [3][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        tool.print(arr);

        int [] arrSort = new int [arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrSort[index++] = arr[i][j];
            }
        }

        Arrays.sort(arrSort);
        tool.print(arrSort);

        index = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = arrSort[index++];
            }
        }

        tool.print(arr);
    }
}
