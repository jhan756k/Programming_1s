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

        Monkey as = new Monkey();
        Dum bi = new Dum();
        Monkey [] ss = new Monkey[10];
        ss[0] = new Monkey();
        ss[1] = new Dum();
        ss[2] = as;
        System.out.println(as.hashCode());

        for (int i=0; i<ss.length; i++){
            System.out.println(ss[i]);
        }

        System.out.println(bi instanceof Monkey);

    }

    public static class Monkey{
        public static int counter = 0;
        
        public Monkey(){
            counter++;
            System.out.println("I am the " + counter + "th monkey.");
        }
    }

    public static class Dum extends Monkey{
        public Dum(){
            System.out.println("I am dumm");
        }
    }
}
