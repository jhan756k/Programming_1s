public class Feb27 {
    public static void main(String[] args) {
        
        //소수 판별
        int divs = 0, n = 104;

        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                divs++; 
                break;
            }
        }

        if (divs == 0) System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");

        /*
        for 문에서 입력값의 조건식 if 포함할때 만약 부합하지 않으면
        i--; continue; --> i를 1 감소시켜야 루프 한번 도는거 취소됨
        
        스캐너로 파일 읽기
        import java.util.*; --> Scanner
        import java.io.* --> File
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        String name = sc.next();
        double score = sc.nextDouble();

        인수에 input.txt 입력
        */

        /* 
        Do-while

        do {
            // statements
        } while (condition); --> 세미콜론 필요 (종료조건 루프)
        
        while(condition){ --> (시작조건 루프)
            // statements
        } 
        
        최소 한번은 실행되는 루프
        for, while 로 항상 바꿀수는 없음
        */
    }
}
