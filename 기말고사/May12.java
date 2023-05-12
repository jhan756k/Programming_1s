public class May12 {
    public static void main(String[] args) {
        Monkey a = new Monkey();
        Monkey b = new Monkey();
        Monkey c = new Monkey();
        Monkey d = new Monkey();
    }

    public static class Monkey{
        public static int counter = 0;
        
        public Monkey(){
            counter++;
            System.out.println("I am the " + counter + "th monkey.");
        }
    }
}
