import java.lang.Integer;
public class June12 {
    public static void main(String[] args) {
        /*
        Inheritance vs Composition
        상속은 기존 클래스를 물려받는것
        합성은 기존 클래스의 인스턴스를 새로운 클래스의 멤버 변수로 만드는 경우
        A is B
        A has B


        -- 다형성 Polymorphism -- 
        class 참조변수 간의 형 변환
        int t = 1;

        Integer a = new Integer(10); --> deprecated
        Integer b = new Integer.valueOf(10);
        String c = new String("Hello");

        t = c; --> error
        t = a;, t=b; -->  no error (Outboxing)
        b = t; --> no error (Inboxing)
        Inboxing, Outboxing

        배열과 배열간의 형변환 - 안되지만 유일한 object class 타입의 배열은 가능 (신경 X)

        클래스 클래스 형변환 - 될때가 있다 (자주 활용 - 특수 관계(상속))

        형변환에는 유사성이 필요 (클래스 됨)
        */
    }
}
