import java.util.Scanner;
public class mjb {
    public static void main(String[] args) {
        // 가위 바위 보 1 2 3
        int player, computer;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("가위(1) 바위(2) 보(3)를 입력하세요.");
            player = sc.nextInt();
            if (player != 1 || player != 2 || player != 3) continue;
            
            computer = (int)(Math.random()*3) + 1;
            System.out.println("컴퓨터는 " + computer + "를 냈습니다.");
        }
    }

    public static void ps(int a){
        System.out.println(a+3);
    }
}
