public class Feb06 {
    public static void main(String[] args) {
        /*
        Type Casting (형변환)
        
        System.out.println(3+3.4); --> 3이 3.0으로 바뀌어서 정상 실행됨
        int a = 6.7; --> 형변환 X 에러남 (6을 6 또는 7로 해야하기 때문 - 0.7 손실) 
        
        형변환시 손실, 오차 없는 경우면 가능하면 형변환 수행해줌 (묵시적 형변환)
        - implicit type conversion
        허나 값을 잃어버리면 안되는 경우에는 형변환 X (명시적 형변환)
        - explicit type conversion

        - 불리언 자료형은 형변환 불가능 -

        1. 올림변환 (promotion)
            - 작은 크기의 자료형을 큰 크기의 자료형으로 변환
            - 자동으로 형변환 됨
            - byte -> short -> int -> long -> float -> double
            - char -> int -> long -> float -> double

        2. 내림변환 (demotion)
            - 큰 크기의 자료형을 작은 크기의 자료형으로 변환
            - 자동으로 형변환 되지 않음
            - double -> float -> long -> int -> short -> byte
            - double -> float -> long -> int -> char

        3. 강제변환 (casting)
            - int a = (int)6.7; --> 강제변환
            - 괄호 --> 형변환 연산자 (cast 연산자)
        
        long --> float promotion (long 64 float 32이지만 float의 표현 능력 늘어남)
        */

        for (int i=4; i>=0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("@");
            }
            for (int k=1; k<=9-2*i; k++) {
                System.out.print((char)('A'+k-1)); // 형변환
            }
            for (int j=0; j<i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        /*
        int n = 100;
        double sum = 0; // --> promotion 이긴 한데 0.0으로 바꿔주는게 좋음 (연산 소모)

        for (int i=1; i<=n; i++) {
            sum += (1.0/i);
        }
        */

        double sum = 0;
        int n = 2147483647; // 숫자 커지면 pi에 근접 - 라이프니츠의 수열 (pi/4 에 수렴)

        for (int x=1; x<=n; x=x+2){
            if (x%4==1) {
                sum = sum + (1.0/x);
            }
            else {
                sum = sum - (1.0/x);
            }
        }

        System.out.println(sum*4.0);
    }
}
