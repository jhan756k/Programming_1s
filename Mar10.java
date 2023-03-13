public class Mar10 {
    public static void main(String[] args) {
        // PPT method-new 문제
        int n = 5;
        
        System.out.println(fib(n));
        bin(n);
    }

    public static int fib(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i=3; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void bin(int n){

        for (int i=1; i<=32; i++){
            System.out.print(n % 2 + " ");
            n /= 2;
        }

        // while(n != 0){
        //     System.out.print(n % 2 + " ");
        //     n /= 2;
        // }
        System.out.println();
    }
}
