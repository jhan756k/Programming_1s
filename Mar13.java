public class Mar13 {
    public static void main(String[] args) {
        /* 
        Iteration vs Recursion
        
        스택에 의한 순서 차이 구분 (recurMe)
        Stack --> Last In First Out (LIFO)
        스택에는 순서대로 main, recurMe1, recurMe2가 쌓임
        스택 쌓이는 순서 공부하기 (예시 recurMe)
        */

        int n = 5;

        System.out.println(addAll(n));
        System.out.println(factorial(n));
        System.out.println(fib_recursion(n));
        System.out.println(gcd_recursion(12, 18));
        System.out.println(biCoefRecursion(5, 3));
        recurMe1(n);
        System.out.println();
        recurMe2(n);
    }

    public static int addAll(int n){
        if (n == 1) return 1;
        else return n + addAll(n-1);
    }

    public static int factorial(int n){
        if (n==1) return 1;
        else return n*(factorial(n-1));
    } 

    public static int fib_recursion(int n) {
        if (n==1 || n==2) return 1;
        else return fib_recursion(n - 1) + fib_recursion(n - 2);
    }

    public static int gcd_recursion(int a, int b){
        if (b==0) return a;
        else return gcd_recursion(b, a%b);
    }

    public static int biCoefRecursion(int n, int k){
        // 나올지 안나올지 애매함 이항계수
        if (k==0 || k==n) return 1;
        else return biCoefRecursion(n-1, k-1) + biCoefRecursion(n-1, k);
    }

    public static void recurMe1(int n){
        if (n==0) return;
        else {
            System.out.print(n + " ");
            recurMe1(n-1);
        }
    }

    public static void recurMe2(int n){
        if (n==0) return;
        else {
            recurMe2(n-1);
            System.out.print(n + " ");
        }
    }
}
