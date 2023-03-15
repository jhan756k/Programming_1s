public class Mar13 {
    public static void main(String[] args) {
        /* 
        Iteration vs Recursion 
        */

        int n = 5;

        System.out.println(addAll(n));
        System.out.println(factorial(n));
        System.out.println(fib_recursion(n));
        System.out.println(gcd_recursion(12, 18));
        System.out.println(biCoefRecursion(5, 3));
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
}
