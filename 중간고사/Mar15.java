public class Mar15 {
    public static void main(String[] args) {
        /* 
        스택에 의한 순서 차이 구분 (recurMe)
        Stack --> Last In First Out (LIFO)
        스택에는 순서대로 main, recurMe1, recurMe2가 쌓임
        스택 쌓이는 순서 공부하기 (알파, 베타, 감마 체크포인트 적기)
        */

        int x = 30;

        recurMe1(1);
        System.out.println();
        recurMe2(1);
        System.out.println();
        bin(x);
        System.out.println();
        bin_32(x, 1);
    }

    public static void recurMe1(int n){
        System.out.print(n + " "); 
        // 호출될 때마다 출력하므로 (n<4)까지 1 2 3 4
        // (n>=4) 가 되면 스택이 점점 비워지는데 if 문 다음에 아무것도 없으므로 아무일도 안일어남)
        if (n<4){
            recurMe1(n+1);
        }
    }

    public static void recurMe2(int n){
        if (n<4){
            recurMe2(n+1);
        }
        System.out.print(n + " "); 
        // 모든 함수가 다 호출되고 나서 스택에 의해 출력되므로 4 3 2 1 
        // F(1) -> F(2) -> F(3) -> F(4) -> F(3) -> F(2) -> F(1)
        // 호ㅗㅗㅗㅗㅗㅗ출ㄹㄹㄹ -> __4_______3_______2_______1_ --> 출력 파트 
    }

    public static void bin(int n){
        if (n==0) return;
        else {
            bin(n/2);
            System.out.print(n%2); 
            // 자동으로 순서 바뀌어서 출력됨
        }
    }

    public static void bin_32(int a, int n){
        if (n==33) return;
        else {
            bin_32(a/2, n+1);
            if (n%4==0 && n!=32) System.out.print(" ");
            System.out.print(a%2); 
            // 자동으로 순서 바뀌어서 출력됨
        }
    }

    // 모든 진법 에서 ABCDEF.. 포함한 범용 변환함수 printNotation 구현해보기
    // MyRecursion.java 파일에 있음

    /* 
    Militime, Time module로 시간 체크
    */
}
