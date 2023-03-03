public class Mar03 {
    public static void main(String[] args) {
        /* 
        -- 저자 PPT 복습 --
        default 없어도 상관 없음
        case 10: case 9: case 8: ... --> 일부러 흘리는 방법도 있음
        
        switch to if --> always possible
        if to switch --> not always possible
        while & for --> always possible

        for 문에서 하나 이상의 변수 사용 가능 
        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.println(i + " " + j);
        }
        
        전역변수, 지역변수 (scope)
        독립중첩, 종속중첩
        
        Loop1: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break Loop1;
                }
            }
        }
        --> Legacy code (go-to 문법 썼던 시절)

        c with classes --> C++

        % --> 음수 실험해보기
        부호는 분자 따라가면 됨
        -5 % 3 = -2
        5 % -3 = 2
        */
    }
}
