public class Mar10 {
    public static void main(String[] args) {
        /* 
        
        */

        int n = 6;
        System.out.println(fib(n));
        bin(n);
    }

    public static int fib(int n) {
        if (n==1 || n==2) return 1;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void bin(int n){
        while(n != 0){
            if (n%2==1){
                System.out.print(1 + " ");
                n/=2;
            }
            else System.out.print(0 + " ");
        }
    }
}
