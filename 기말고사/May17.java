public class May17 {
    public static void main(String[] args) {
        /*
        오버로딩된 생성자

        지역변수와 전역변수의 이름이 같을 때 지역변수가 우선시됨
        this.변수명 --> 전역변수를 가리킴
        */

        May17 m = new May17();
    }

    public May17(){
        // May17(1.0); --> 파라미터가 존재하나 재귀호출마냥 되서 에러뜸
        // 따라서 this 키워드 사용 this() --> 현재 클래스의 모든 생성자를 의미
        this(1.0); // --> 에러없이 완료 출력됨
    }

    public May17(double r){
        System.out.println("완료" + r);
    }
}
