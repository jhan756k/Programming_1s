public class Apr0424 {
    public static void main(String[] args) {
        int a[] = new int [3];
        Circle b = new Circle(); // 정의
        
        b.pi = 3.14;
        b.radius = 4.5;

        System.out.println(b.area());
        System.out.println(b.circumference());
    }
}
