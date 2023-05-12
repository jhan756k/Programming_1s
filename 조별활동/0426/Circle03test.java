class Circle03{
    private double pi = 3.14;
    private double radius;
    public static int counter;

    public Circle03() {
        radius = 1.0;
    }

    public double area() {
        return pi * radius * radius;
    }

    public void setRadius(double r) { // setter
        if (r<=0) {System.out.println("반지름은 0보다 커야 합니다."); radius=1.0;}
        else radius = r;
    }

    public double getRadius() { // getter
        return radius;
    }
    
    public double getPi() {
        return pi;
    }

    public double circumference() {
        return 2.0 * pi * radius;
    }
}

public class Circle03test {
    public static void main(String[] args) {
        Circle03 a = new Circle03(); 
        a.setRadius(56.78);

        System.out.println(a.circumference());
    }
}