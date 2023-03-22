public class Mar22 {
    public static void main(String[] args) {
        /* 
        Deep copy, Shallow copy

        CPU - 주기억장치 - 보조기억장치 - I/O 장치
        주메모리 - RAM
        0번지 ~ 16G-1 번지 
        한칸 한칸의 단위가 바이트 (8비트)
        맨앞 - 특수한 용도로 사용
        그후 OS (windows) 
        그다음 시작 프로그램
        
        필요한 부분이 있다면 램에서 읽어서 CPU로 보냄 (패치)
        한번의 CPU로 이동할 수 있는 용량 --> 버스 용량 (32비트, 64비트)
        알트탭으로 창을 바꾸고 다시 원래 창으로 바꾸면 전 실행 기점까지를 복원해야함 (Context Switching)

        JVM은 가상 머신 --> .java 파일에 한해 컴퓨터의 모든 기능을 포함한다고 볼 수 있음
        JVM에서 CPU, 메모리 등의 역할을 하는 코드가 존재함

        RAM은 하드웨어이므로 용량이 정해져 있음
        그러나 Virtual Machine 은 로딩될 때마다 RAM의 번지수가 항상 다를 수 있어서 번지수를 찾을 수 없음

        x.java --> x.class
        이걸 java.exe를 통해 실행하면 x.class의 이진 코드가 JVM의 메모리 어딘가에 로딩됨
        
        바뀌지 않는 메모리의 스타트 번지수 --> a
        a+1, a+2, a+3, a+4, ...

        ex) int a = 5;
        라는 코드는 5를 이진화하여 a번지부터 시작하여 4칸을 차지하게 됨
        a = a+1;
        라는 코드는 먼저 a의 메모리를 액세스 후 CPU 에 보내 연산을 시키고 반환값을 a라는 메모리로 가 덮어씌워라 라는 명령을 내림

        int b[]; --> b 메모리를 지정하라
        b = new int[3]; --> int가 3개 들어갈만한 공간 (4바이트 * 3 = 12바이트 할당)
        연속적이어야 함 (점유되어있지 않은)
        96비트에는 전에 돌아간 프로그램에 의한 잔재가 있을 수 있음.
        그래서 초기화를 해줘야 함 --> new 키워드가 초기화 역할을 함 (0으로 초기화)

        배열은 참조형 데이터이므로 
        메모리의 다른 위치에 존재한 배열을 가리키는 것이 가능함 --> 레퍼런스
        따라서 b메모리에는 배열의 시작 번지수가 저장됨
        int라는 키워드에 따라 4비트씩 끊어 처리함
        끊긴 조각들 중 b[0] 은 첫번째꺼, b[1]은 두번째꺼, b[2]는 세번째꺼를 가리킴
        그래서 배열 그냥 출력하면 주소값이 나옴
        */

        int orig[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int deepcopy[] = new int[orig.length];

        for (int i=0; i<orig.length; i++){
            deepcopy[i] = orig[i];
        }
        orig[2] = 1000;
        System.out.println(deepcopy[2]); // Deep Copy의 경우에는 각기 다른 배열이므로 원본 배열의 값이 바뀌어도 복사본 배열의 값은 바뀌지 않음

        int shallowcopy[] = orig;
        orig[2] = 3000;
        System.out.println(shallowcopy[2]); // Shallow Copy의 경우에는 원본 배열과 복사본 배열이 같은 배열을 가리키므로 원본 배열의 값이 바뀌면 복사본 배열의 값도 바뀜
    } 
}
