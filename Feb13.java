public class Feb13 {
    public static void main(String[] args) {
        /* 2. 비트 논리 연산자

        &, |, ^, ~ (비트 AND, 비트 OR, 비트 XOR, 비트 NOT)

        그냥 논리 연산자는 불리언
        비트 논리 연산자는 비트가 연산 대상

        0 - FALSE, 1 - TRUE 로 논리 연산자랑 똑같이 계산

        ! (not) 논리 연산자 --> ~ (not) 비트 논리 연산자 
        !dumb = ~dumb
        
        논리 연산에는 없는 비트 논리 연산자 --> ^ (bit exclusive or - xor)
        서로 다르면 1, 같으면 0 (자석으로 생각하면 됨)

        int a = 7;
        int b = 13;

        sysout(a & b); 
        7  --> 00000..0111
        13 --> 00000..1101
        &  --> 00000..0101
        --> 5

        sysout(~a);
        7  --> 00000..0111
        ~  --> 11111..1000 (1111..1001은 2의 보수법에 따라 -7 이므로 이보다 1 적은 값이 -8이 답)
        --> -8

        5 --> -6
        -6 --> 5

        시프트 연산자 + 비트 논리 연산자 = 비트 연산자

        하드웨어 컨트롤할때 씀

        self ^ self = 0
        

        단항연산자 --> ~, !, (type) --> 전위 연산자 (무조건 고정)
        하지만 ++, -- 은 후위 연산자 (전위도 됨)
        
        전위, 후위는 단순한 식에서는 차이가 없지만, 복잡한 식에서는 차이가 있음
        j = i++; --> j = i;
        j = ++i; --> j = i+1; 후위에서는 마지막에 실행, 전위는 가장 먼저 실행
        */
    }
}
