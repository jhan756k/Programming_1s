public class Apr0424 {
    public static void main(String[] args) {
        Circle a = new Circle(); // 정의
        
        a.pi = 3.14;
        a.radius = 4.5;

        // 정사각형의 넓이에 가장 가까운 원의 반지름을 구하시오.

        double squareArea = 80;
        final double delta = 0.001;
        double diff1 = 0.0, diff2=0.0;

        while (a.area() < squareArea) { 
            diff1 = squareArea - a.area();
            a.radius += delta;
        } 
        diff2 = a.area() - squareArea;

        System.out.println(diff1 + " " + diff2);

        if (diff1 < diff2) {
            System.out.println(a.radius-delta);
        } else System.out.println(a.radius);
    }
}
