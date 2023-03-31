import java.util.Arrays;

public class Mar31 {
    public static void main(String[] args) {
        /*
        - Selection sort
        - Bubble sort
        - Insertion sort
        - Shell sort
        - Merge sort
        - Quick sort
        - Java API Sort (java.util.Arrays)
        */
        int[] arr = { 5, 4, 3, 2, 1 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        System.out.println();

        int [] arr2 = new int []{6, 7, 9, 8, 10};
        Arrays.sort(arr2); // JAVA API Sort 
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static boolean isExist(int[] arr, int n){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == n) return true;
        }
        return false;
    }
}
