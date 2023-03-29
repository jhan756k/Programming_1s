public class Mar29 {
    public static void main(String[] args) {
        /*
        Array 연습 4 문제

        정렬 (Sorting)

        -- 선택정렬 Selection Sorting --
        1. 배열을 순회하여 최솟값을 찾아낸다
        2. 그값과 찾기 시작한 점과 교환한다. 
        - 한마디로 앞에서부터 최솟값을 하나씩 넣어준다.
        */

        // 문제 1
        int arr [] = new int [6];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int tmp = (int)(Math.random()*45 + 1);

            for (int j = 0; j < i; j++) {
                if (tmp == arr[j]) {
                    i-=1;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                flag = false;
                continue;
            }
            arr[i] = tmp;
        }

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        
        // 문제 2
        sortList(arr);

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();

        // 문제 3
        int t1 [] = new int [] {1, 2, 3, 4, 5, 6};
        int t2 [] = new int [] {3, 2, 4, 8, 6, 1};

        sortList(t1);
        sortList(t2);

        for (int x=0; x<6; x++){
            if (t1[x] != t2[x]){
                System.out.println("두 배열은 다릅니다.");
                break;
            }
            if (x==5) System.out.println("두 배열은 같습니다.");
        }
    }

    public static int [] sortList(int [] arr) { // Selection Sort
        for (int x=0; x<arr.length; x++) {
            for (int y=x+1; y<arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        // 아니면 minval, minindex 변수 잡아서 마지막에 한번만 대입해도 됨
        return arr;
    }
}
