public class Feb08 {
    public static void main(String[] args) {
        /*
        OPERATOR (연산자)
        OPERAND  (피연산자)
        
        단항연산자 --> !true, casting 등등
        이항연산자 --> +, -, *, /, %, ==, !=, >, <, >=, <=, &&, || 등등
        삼항연산자 --> 조건식 ? true일때 : false일때

        연산자 우선순위
        System.out.println(3+4*5); --> 23이 나옴
        3 + 4 < 5 --> 산술연산자가 관계연산자보다 우선순위가 높기 때문에 7 < 5가 됨

        단순한 수식 --> 연산자 하나
        복잡한 수식 --> 연산자 여러개 (연산자 우선순위가 중요함)

        연산자의 결합 방향
        3 + 4 - 5 --> 우선순위가 동일할때에는 Left to Right (7-5)
        a = b = 10; --> 얘는 Left to Right이 우선순위 때문에 10이 b에 들어가고 그 다음에 a에 들어감

        괄호연산자는 우선순위 정할때 (가장 높음)

        double1 = 1.0/3.0
        double2 = 0.3333333333333333333334;
        --> 실수오차 범위로 인해 같다고 나옴
        
        비트 조작 연산자
        1. 시프트 연산자
        <<, >>, >>>

        35 << 2 --> 왼쪽으로 2 밀기
        0000100011 --> 0010001100 원래 숫자의 2^2 배가 됨
        곱하기로 할순 있으나 cpu에는 비트연산을 하는 기능이 있지만 곱하기는 없는 관계로 훨씬 속도가 빠름
        
        31까지 밀면 0자리수가 끝으로 감
        원래 31까지는 곱셈을 해도 오버플로우 발생
        근데 32 이상으로 밀면 0이 됨 (의미 X) --> 따라서 32로 나눈 나머지만큼 밀어줌 (ex. 33 = 1)

        시프트 라이트는 만약 수가 음수면 (-5 >> 1) 보수법을 밀면 맨 앞자리가 1으로
        자동으로 바뀜
        따라서 >>> 연산자를 사용해야함 (1로 안채우고 0이 됨) 

        비트 시프트를 하고 보니 곱이 되는데 우리가 사용할 때 불편하니까 >>> 만든거
         */
    }  
}
