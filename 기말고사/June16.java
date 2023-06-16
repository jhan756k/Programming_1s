public class June16 {
    public static void main(String[] args) {
        /*
        Object obj = new Object();
        String str = new String("Hello");

        obj = str; // Object obj = new String("Hello"); --> 가능
        str = obj; // String str = new Object(); --> 불가능

        instanceof 연산자: 참조변수가 참조하는 인스턴스의 실제 타입을 알아보기 위해 사용

        getClass, getName --> 클래스의 이름을 문자열로 반환 (모두 오버라이딩 되었음을 알 수 있음)

        클래스의 부모 쪽으로 갈수록 추상성이 높아지고, 자식 쪽으로 갈수록 구체적이다.
        
        전체적인 디자인을 할 수 있음

        abstract class --> 추상 클래스 (무조건 부모 클래스를 상속받아야 함 아니면 에러  )
        */
        Object obj = new Object();
        String str = new String("Hello");
        Integer i = Integer.valueOf(10);

        obj = str; // Object obj = new String("Hello"); --> 가능
        str = (String)obj; // String str = new Object(); --> 불가능
        System.out.println(obj +", "+ str);

        System.out.println(obj instanceof String);

        obj = i;
        System.out.println(obj +", "+ i);
        
        System.out.println(obj instanceof Integer);
    }
}
