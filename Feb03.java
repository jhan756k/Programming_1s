import java.util.Scanner;
// import java.util.*

public class Feb03 {
    public static void main(String[] args){
        int i, n, d, j, m;

        /*
        n = Integer.parseInt(args[0]); 
        m = Integer.parseInt(args[1]);
        --> 위 코드 실행 안되고 바로 프롬프트 실행됨

        실행할 때마다 인수(입력값)을 받아야 함
        exception in thread, arrayindexoutofboundsexception
        
        따라서 인수에 ${FileNameNoExt} ${prompt} 입력 (launch.json에서 args 설정)
        */
        
        // 스캐너는 코드 위치에서 실행됨
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("첫번째 정수를 입력하세요: ");
            m = sc.nextInt();
            if (m<1) { System.out.println("1 이상의 정수를 입력하세요."); continue; }
            else break;
        }
        
        
        System.out.print("두번째 정수를 입력하세요: ");
        n = sc.nextInt();

        for (i=m; i<=n; i++){
            d=0;
            for (j=1; j<=i; j++) if (i%j==0) d=d+1;

            if (d==2) System.out.println(i+" 은 소수입니다.");
            else System.out.println(i+" 은 소수가 아닙니다.");
                
        }
        
    }
    
}
