public class Feb24 {
    public static void main(String[] args) {
        // 유클리드 호제법 GCD
        int a = 480;
        int b = 859912;
        
        System.out.println(a+" "+b); 

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            
            System.out.println(a+" "+b); 
        }
        System.out.println(a==0 ? b : a);
        System.out.println(a+b);
    }

    // for (; a != 0 && b != 0;) --> 세미콜론으로 끝내면 됨
}
