public class Mar06 {
    public static void main(String[] args) {
        /* 
        Method - a block of code that is executed when it is called upon

        public static int (return type) add (method name) (int a, int b) (parameters) {
            return a + b;
        }
        
        헤더와 바디 
        헤더: public static int add(int a, int b)
        바디: { return a + b; }

        접근제어자: public, private, protected, default
        기타제어자: static, final, abstract, synchronized, native, strictfp
        -- 접근제어자와 기타제어자는 안배울 예정 public static 고정 -- 

        리턴타입: void, int, double, float, boolean, char, String, 클래스이름, 인터페이스이름

        Identifier: 변수, 메소드, 클래스, 인터페이스 이름
        
        변수, 메소드 --> camelCase
        클래스, 인터페이스 --> PascalCase

        메소드를 사용하는 이유
        - 코드의 재사용
        - 코드의 관리
        - 코드의 중복을 제거
        - 모듈화 (Moudularization)

        메소드 디자인 순서 --> Method-new PPT (상식적으로는 역순인게 존재함)
        지역변수는 이름 같아도 상관 X
        그냥 함수 호출하면 리턴값 출력 X
        */

        printName(4);
        printLessPrime(12);
        System.out.println(getSum(10));
        System.out.println(getPrimeNumber(12));
        System.out.println(getGCD(12, 15));
    }

    public static void printName(int n){
        for (int i = 0; i < n; i++){
            System.out.println("My name is 한준희");
        }

        return; // 써도 되고 안써도 되고
    }

    public static void printLessPrime(int n){
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int getSum(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }

        return sum;
    }

    public static int getPrimeNumber(int n){
        int cnt = 0;
        for (int i=1; i<=n; i++){
            if (n%i==0){
                cnt++;
            }
        }

        return cnt;
    }

    public static int getGCD(int a, int b){
        int gcd = 0 ;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (a!=0 && b!=0){
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        
        gcd = a + b;
        return gcd;
    }


}