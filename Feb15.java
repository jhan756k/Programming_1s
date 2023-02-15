public class Feb15 {
    public static void main(String[] args) {
        /*
        부호 연산자 +, -

        확장된 대입연산자
        +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=, ~= 등등

        삼항연산자
        조건식 ? 참일때 : 거짓일때
        ex)  int a = 10;
             int b = 20;
             int c = a > b ? a : b;
             System.out.println(c); // 20

        결국에는 하나의 값을 리턴하기 때문에 삼항연산자 중첩 가능

        변수 명명에는 2가지 특수문자만 가능 --> _, $

        

        2 <= x <= 10 --> (L->R) 순서이므로 앞 수식 (2<=x) 이 true/false 를 리턴하는데
        불리언을 <=10 하려고 하니 에러가 남 (불리언 형변환 X)

        따라서 x>=2 && x<=10 으로 해야함
        근데 (2&&x) 가 우선순위로 먼저 되는게 아닌가?
        --> (x>=2) && (x<=10) 하지만 같음 (비교연산자가 논리연산자보다 우선순위 높음)
        
        자바의정석 3장 PPT 연산자 우선순위 참고
        단항 > 산술 > 비교 > 논리 > 삼항 > 대입 연산자 순서
        단항, 대입 연산자만 L->R 순서로 진행
        */
    }
}
