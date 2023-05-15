public class May12 {
    public static void main(String[] args) {
        Monkey a = new Monkey();
        Monkey b = new Monkey();
        Monkey c = new Monkey();
        Monkey d = new Monkey();

        /* 스태택 메소드는 새로 인스턴스 만들어서 함수 쓸 필요없이 classname.methodname() 가능함
        static 만으로는 오버로딩 안됨
        클래스 메소드는 인스턴스 변수에 접근할 수 없음
        */
    }

    public static class Monkey{
        public static int counter = 0;
        
        public Monkey(){
            counter++;
            System.out.println("I am the " + counter + "th monkey.");
        }
    }
}
