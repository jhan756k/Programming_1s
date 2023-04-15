public class midterm {
    public static void main(String[] args) {
        /*
        import java.util.*; --> Scanner
        import java.io.* --> File

        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("input.txt"));
        int num = sc.nextInt();
        String name = sc.next();
        double score = sc.nextDouble();

        >>> --> 0으로 채워서 음수는 오버플로우 발생
        비트연산자는 그냥 나눈거 몫에다가 부호만 붙이면 됨

        ~(-5) --> 4
        ~4 --> -5 

        2 <= x <= 10 --> (L->R) (true) <= 10 --> 에러 
        변수 명명 _, $
        단항 산술 비교 논리 삼항 대입
        
        int a = 1000000;
        int b = 2000000;
        long c = a * b; // 컴파일 에러 (연산하는 시점에서 이미 오버플로우가 발생)
        long c = (long)a * b; // 강제 형변환을 해줘야함

        char c1 = 'a';
        char c2 = c1 + 1; // 컴파일 에러 (a + 1 은 int 이기에 char는 demotion)
        하지만 char c2 = ++c1; // 예외적으로 에러 발생 X

        "A" == 65 ==> true

        && > || 우선순위

        i *= 10 + j; ==> i = i * (10 + j);
        
        3<<1+2 --> 덧셈 먼저

        switch-case 구문은 빠르고, case가 true일때 break를 만날때까지 밑에꺼 전부 실행
        switch-case 에서 default문은 위치가 상관 없으나 맨 맽이 아니면 break 필요

        몬테카를로 기법 (Feb20)
        유클리드 호제법 (Feb24)
        라이프니츠 수열 (Feb06)
        근사값 루트 (Mar08)
        재귀함수 (fibonacci, digit, 이항계수 - Mar10/15, MyRecursion.java)
        Sorting (Insertion, Bubble, Java API - Mar29)
        역행렬 구현 (가우스-조던)

        조건문에서 내용 없이 ; 만 치면 while문 구현 가능

        do-while --> for, while 로 항상 바꿀수는 없음

        for 문에서 하나 이상의 변수 사용 가능 

        부호는 분자 따라가면 됨
        -5 % 3 = -2
        5 % -3 = 2

        헤더/바디, 접근제어자/기타제어자, 리턴타입, 아이덴티파이어

        변수, 메소드 --> camelCase
        클래스, 인터페이스 --> PascalCase

        메소드를 사용하는 이유
        - 코드의 재사용
        - 코드의 관리
        - 코드의 중복을 제거
        - 모듈화 (Moudularization)

        데이터 타입, 개수, 순서 --> 시그니처

        Stack --> Last In First Out (LIFO)

        main은 키워드가 아닌 아이덴티파이어임. 따라서 JVM이 호출하는 형식.
        다른 메소드가 main 메소드를 호출할 수 있음.
        main에서도 return 쓸 수 있음 (void라 생략)

        Tail Recursion
        - 쌓인 스택을 제거하는게 오래걸림
        - 복기 과정을 줄이면 시간이 단축됨
        - Tail Recursion에서 복기 과정은 연산을 위한 것이 아닌 리턴포인트를 저장하는 것뿐임
        
        배열은 자동 초기화 O --> 정의 안해도 연산 가능

        메모리를 할당받았지만 어떤 변수를 통해서도 접근할 수 없는 메모리를 Garbage 라고 함
        Garbage Collection 은 JVM이 알아서 해줌 (스케쥴러)

        JVM에서 main 메소드가 차지하는 메모리를 다른 메소드가 접근 가능? X
        왜냐하면 메소드는 다른 메모리 범주를 사용하기 때문

        int [] arr [] 가능
        int [] arr[], x; - 정의할 때 arr은 2차원, x는 1차원

        int [][] arr = new int [3][]; 
        --> 이렇게 정의하면 arr[0], arr[1], arr[2]는 null

        */
    }
}
