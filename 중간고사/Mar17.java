public class Mar17 {
    public static void main(String[] args) {
        /* 
        메소드
        - main 메소드는 JVM에서 호출함
        - main은 키워드가 아닌 아이덴티파이어임. 따라서 JVM이 호출하는 형식.
        - 다른 메소드가 main 메소드를 호출할 수 있음.
        - main에서도 return 쓸 수 있음 (void라 생략)

        Recursion의 테크닉 
        - Tail Recursion
            - 쌓인 스택을 제거하는게 오래걸림
            - 복기 과정을 줄이면 시간이 단축됨
            - Tail Recursion에서 복기 과정은 연산을 위한 것이 아닌 리턴포인트를 저장하는 것뿐임

        int sum(int n) { --> augmenting recursion   
            if (n == 1) return 1;
            return n + sum(n-1);
        }

        int sum(int n, int acc) { --> tail recursion
            if (n == 1) return acc;
            return sum(n-1, acc + n);
        }

        - Recursion with memoization
        */
    }
}
