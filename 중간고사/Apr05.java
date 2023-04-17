public class Apr05 {
    public static void main(String[] args) {
        /*
        2차원 배열 Deep Copy, Shallow Copy
        */
        
        int [][] arr = new int [3][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*10);
            }
        }
        
        printArray(arr);
        
        int [][] copy = deepCopy2(arr);
        int [][] copy2 = shallowCopy2(arr);

        arr[2][1] = 10;
        printArray(copy);
        printArray(copy2);
    }

    public static int[][] deepCopy2(int arr[][]){
        int[][] copy = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copy[i][j] = arr[i][j];
            }
        }
        return copy;
    }

    public static int[][] shallowCopy2(int arr[][]){
        int[][] copy = arr;
        return copy;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
