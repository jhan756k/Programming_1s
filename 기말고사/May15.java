public class May15 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();

        c1.printRad();
        c2.printRad();
        c3.printRad();
        c4.printRad();
    }

    public static class Circle{
        private static int count =0;
        private int radius;

        public Circle(){
            this.radius = count+=1;
        }

        public void printRad(){
            if (radius == 4)
                System.out.println("I am the last circle.");
            else
                System.out.println(radius);
        }
    }
}
