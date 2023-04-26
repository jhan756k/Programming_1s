class Circle02{
    private double pi = 3.14;
    private double radius;

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
}

public class Circle02test {
    public static void main(String[] args) {
        Circle02 a = new Circle02(); 
        a.setRadius(56.78);

        System.out.println(a.area());
        System.out.println(a.getRadius());
        System.out.println(a.getRadius()*a.getPi()*2.0);
    }
}
