public class Mar20 {
    public static void main(String[] args) { // --> String args [] 해도 상관없음
        /* 
        배열 Array
        - 동일한 데이터 형의 집합적 데이터 타입
        - 기본형 자료형 아닌 참조 자료형 
        - 선언뿐만 아니라 정의도 필요함
        - 초기화: 사용가능해진 시점에 최초로 값을 주는 것
        - 기본자료형은 자동 초기화 X
        - 배열은 자동 초기화 O
        - int:0 char: u\0000 () double: 0.0 boolean: false --> 0으로 자동초기화됨
        - 따라서 아직 정의하지 않은 배열값에 연산해도 에러 안뜸 (arr[i+1] = arr[i]+1)

        배열의 선언
        자료형[] 배열이름;
        int [] arr; or int arr[]; --> []를 변수명 앞뒤 어디에나 적어도 상관 X

        배열의 정의 [초기화]
        배열이름 = new 자료형[배열크기];
        arr = new int[5];
        arr = new int[]{1,2,3,4,5};

        배열의 선언과 정의
        자료형[] 배열이름 = new 자료형[배열크기];
        int[] arr = new int[]{1, 2, 3, 4, 5};
        */  

        int arr1[];
        arr1 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        System.out.println();


        double arr2[] = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        System.out.println();


        int arr3[] = new int[]{35, 56, 84, 99, 74};
        int mean=0, max=-1, min=101; // 실제 배열의 원소값을 사용해도 됨. 대신 루프를 0 아닌 1부터 시작
        for (int i = 0; i < arr3.length; i++) {
            mean+=arr3[i];
            if (max < arr3[i]) max = arr3[i];
            if (min > arr3[i]) min = arr3[i];
        }
        System.out.println((double)mean/arr3.length);
        System.out.println(max);
        System.out.println(min);


        System.out.println();


        int arr4[] = new int[10];
        int cnt=0;
        for (int i=0; i<arr4.length; i++){
            arr4[i] = (int)(Math.random()*50 + 51); 
            if (arr4[i]%2==1) cnt++;
        }
        System.out.println(cnt);


        System.out.println();
    }
}
