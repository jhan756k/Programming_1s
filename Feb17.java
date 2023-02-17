public class Feb17 {
    public static void main(String[] args) {
        /*
        int보다 크기가 작은 정수형은 모두 int로 바꿔버린다
        따라서 byte와 short 연산할때는 둘다 int로 형변환이 이루어짐

        byte a = 10;
        byte b = 20;
        byte c = a + b; // 컴파일 에러 (a+b 는 int 이기에 byte는 demotion)
        byte c = (byte)(a + b); // 강제 형변환을 해줘야함
        
        int a = 1000000;
        int b = 2000000;
        long c = a * b; // 컴파일 에러 (연산하는 시점에서 이미 오버플로우가 발생)
        long c = (long)a * b; // 강제 형변환을 해줘야함
        
        long b = 1000000 * 1000000L; (L 붙이면 long으로 인식 - 타입캐스팅 아님)

        int c = 1000000 * 1000000 / 1000000; // 연산진행 방식으로도 에러 해결 가능
        int c = 1000000 / 1000000 *1000000; // 혹은 괄호로 해결
        
        char c1 = 'a';
        char c2 = c1 + 1; // 컴파일 에러 (a + 1 은 int 이기에 char는 demotion)
        (A = 65, a = 97)
        char c2 = (char)(c1 + 1); 

        char c2 = ++c1; // 예외적으로 에러 발생 X

        int i = '2'-'0' ==> 2 // char 2 에서 char 0 을 빼니 50-48 = 2

        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f; ==> 3.141f
        
        float shortPi = Math.round(pi * 1000) / 1000f; ==> 3.142f
        // 연산 과정에서 3141.592f 가 소수점 첫째 자리에서 반올림됨

        'A' < 'B' ==> true
        '0' == 0 ==> false
        "A" == 65 ==> true
        10.0d == 10.0f ==> true (우연히 소수점 아래 수가 없어서 같아보임)
        0.1d == 0.1f ==> false (형변환 오차)
        sysout((double)0.1f) ==> 0.10000000149011612

        && > || 우선순위

        i *= 10 + j; ==> i = i * (10 + j); // 괄호 없이는 다름

        기말고사시험용.txt 보기
        우선순위 / 연산방향 암기하기
        3<<1+2 --> 덧셈 먼저
        */
    }
}
