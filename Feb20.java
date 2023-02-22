public class Feb20 {
    public static void main(String[] args) {
        /*
        조건문과 선택문
        
        조건식에서 가장 많은 범위를 포함하는 것을 if, 뒤로 순서대로 else if, else

        switch (수식 --> 정수형으로 묵시적 형변환 가능한 수식 3.7같은거 안됨)
        {
            case 값1:
                수식의 값이 값1일 때 실행할 문장들;
                break;
            case 값2:
                수식의 값이 값2일 때 실행할 문장들;
                break;
            default:
                수식의 값이 위의 값들과 일치하지 않을 때 실행할 문장들;
                break;
        }
        
        Switch-case는 단일한 값의 조건을 이용하는 if-else if-else의 대용구문이다.
        범위를 switch-case로 표현하기에는 너무 번거로움

        만약 break 구문 쓰지 않으면 조건에 부합하는 case 밑의 모든 case의 문장들이 실행된다.
        왜냐하면 Switch-Case 문에서는 조건에 부합하는 가장 첫번째 case로 점프해서 밑에있는거까지 실행

        하지만 때로 흘러내리는 제어가 좋을 때도 있음
        switch(score2) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            ...
        }

        Default는 맨 밑에 있으니까 그럼 break를 안써도 되는건가?
        물론 상관없긴 하지만 Default 문을 case 어디에도 넣어도 상관없음 (맨위도 가능)
        따라서 Default 구문이 맨 마지막에 있지 않는 이상 필요함

        if, switch
        공통점: 여러개중 택일 실행
        차이점: if는 조건의 제한이 없음, switch는 정수형으로 묵시적 형변환 가능한 단일값 수식만 가능
        
        근데 왜 switch-case를 쓰는가? --> 훨씬 더 빠르게 수행됨
        (if는 조건식 하나씩 검토하며 순차적으로, switch는 검토 없이 값으로 바로 점프)
        (if는 원래 조건이 만족되면 바로 종료되나, switch는 흘러내림 --> break로 보완 가능)
        
        switch-case가 if 보다 미학적으로 깔끔하다.
        
        if, switch-case, 삼항연산자

        
        Math.random()은 0.0 이상 1.0 미만 임의의 double 형 숫자 생성 (0.0 <= x < 1.0)
        */

        System.out.println((int)(Math.random()*50.0+50.0)); 
        // 50 <= x <= 99 인 임의의 정수 (Math.random() 은 1.0 반환 X)

        

        // 몬테카를로 기법 (x/n = pi/4)

        int count = 0;
        int trial = 1000000;
        for (int i = 0; i < trial; i++) {
            double x, y;
            x = Math.random();
            y = Math.random();

            if (x*x + y*y <= 1.0) count++;
        }

        System.out.println((double)count/trial*4.0);
    }
}
