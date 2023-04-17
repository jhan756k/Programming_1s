public class Mar27 {
    public static void main(String[] args) {
        /* 
        JVM에서 main 메소드가 차지하는 메모리를 다른 메소드가 접근 가능? X
        왜냐하면 메소드는 다른 메모리 범주를 사용하기 때문
        */
        int [] num = new int []{1, 2, 3, 4, 5};
        printArr(num); // --> int [] arr = num; 이렇게 복사되어서 들어감 (메소드의 장벽 뚫음)

        System.out.println();

        printTwice(num);
        for (int i=0; i<num.length; i++) System.out.print(num[i] + " ");

        System.out.println();

        System.out.println(checkExist(num, 3));

        int [] minMax = minMax(num);
        System.out.println(minMax[0] + " " + minMax[1]);

        int [] arr1 = new int []{1, 2, 3, 4, 5};
        int [] arr2 = new int []{1, 2, 3, 4, 6};
        int [] arr3 = newArr(arr1, arr2); // 이거도 shallow copy
        System.out.println(arr3[0] + " " + arr3[1]);
        // newArr(arr1, arr2)[0]; newArr(arr1, arr2)[1]; 문법적으로 가능함. 그러나 호출 많음
    }

    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void printTwice(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i]*=2;
        }
    }

    public static boolean checkExist(int[] arr, int a){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == a) return true;
        }
        return false;
    }

    public static int [] minMax(int[] arr){
        int []res = new int[]{arr[0], arr[0]};

        for (int i=0; i<arr.length; i++){
            if (arr[i] < res[0]) res[0] = arr[i];
            if (arr[i] > res[1]) res[1] = arr[i];
        }
        return res;
    }
    
    public static int[] newArr(int[] arr1, int[] arr2){
        int add1=0, add2=0;
        for (int i=0; i<arr1.length; i++){
            add1 += arr1[i];
            add2 += arr2[i];
        }
        return new int []{add1, add2};
    } 

    // 배열을 메소드 안에서 새로 선언해서 리턴해도 되고,
    // 위처럼 new int[]{...}로 리턴해도 됨
}
