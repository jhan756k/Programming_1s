public class Mar08 {
    public static void main(String[] args) {
        /* 
        Math 모듈 사용
        System.out.println(Math.sqrt(2));

        메소드는 서로 호출 가능
        
        이름이 같고 파라미터 다르면 --> 메소드 오버로딩
        system.out.println(plus(1, 2));
        system.out.println(plus(1.0, 2.0)); 
        둘다 작동함
        전제: 파라미터가 충분히 구별될 수 있어야함 (데이터 타입, 개수, 순서 --> 통틀어서 시그니처)
        argument의 시그니처가 다르기만 하다면 메소드 오버로딩 가능
        자동 형변환 고려해야 함 (plus(25, 15.0) 은 실수, 실수 함수 호출)

        프로그램은 main 메소드부터 시작 --> 컴파일은 가능하나 실행하면 에러

        MethodPrac.printMyName(3); --> 클래스 이름으로 접근 가능
        이런거의 집합을 라이브러리로 부름 
        API (Application Programming Interface) 라고도 부름
        */

        System.out.println(getGCD(12, 15));
        printMult(9);
        System.out.println(returnSeq(1, 3, 5));
        System.out.println(getPrimeNumber(12));
        printCd(12, 15);
        System.out.println(getLcm(12, 15));
        System.out.println(getRoot(2));
        System.out.println(plus('A', 3)); // --> 정수합으로 형변환
        mjb.ps(0); // --> 클래스 이름으로 접근함
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

    public static double getRoot(double n){
        int TRIAL = 10;

        double approx = 68.0;
        for (int i=0; i<TRIAL; i++){
            approx = (approx + n/approx)/2.0;
        }
        System.out.println(Math.sqrt(n));
        return approx;
    }

    public static void printMult(int n){
        for (int x=1; x<=n; x++){
            for (int y=1; y<=n; y++){
                System.out.print(x+ " x " + y + " = " + x*y + "    ");
            }
            System.out.println();
        }

        return;
    }

    public static int returnSeq(int a, int d, int n){
        return (a + (n-1)*d);
    }

    public static void printCd(int n, int m){
        int min = (n<=m) ? n : m;

        for (int x=1; x<=min; x++){
            if (n%x==0 && m%x==0){
                System.out.print(x + " ");
            }
        }
        System.out.println();
        return;
    }

    public static int getLcm(int n, int m){
        return n*m/getGCD(n, m); // 오버플로우의 가능성 높음

        /*
        오버플로우 방지
        int gcd = getGCD(n, m);
        int v1 = n/gcd;
        int v2 = m/gcd;
        return v1*v2*gcd;
        */
    }

    public static int plus(int a, int b){
        System.out.println("정수합");
        return a+b;
    }

    public static double plus(double a, double b){
        System.out.println("실수합");
        return a+b;
    }

    public static int plus (int a, int b, int c){
        System.out.println("3개 정수합");
        return a+b+c;
    }
}
