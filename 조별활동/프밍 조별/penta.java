public class penta {
    public static void main(String[] args) {
        regular_pentagon p1 = new regular_pentagon();
        regular_pentagon p2 = new regular_pentagon(5);

        System.out.println("The area of the pentagon is " + p1.area() + ".");
        System.out.println("The perimeter of the pentagon is " + p1.perimeter() + ".");
        
        System.out.println("The area of the pentagon is " + p2.area() + ".");
        System.out.println("The perimeter of the pentagon is " + p2.perimeter() + ".");

        System.out.println("The radius of the inscribed circle is " + p1.inscribedCircle() + ".");
        System.out.println("The radius of the inscribed circle is " + p2.inscribedCircle() + ".");

        System.out.println("The radius of the circumcircle is " + p1.circumCircle() + ".");
        System.out.println("The radius of the circumcircle is " + p2.circumCircle() + ".");
    }
}
