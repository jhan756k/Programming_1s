public class mjb {
    public static void main(String[] args) {

        int human, computer, result;
        
        while (true){
            System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
            human = Integer.parseInt(args[0]);
            
            if (human<1 || human>3) { System.out.println("1, 2, 3 중 하나를 입력하세요."); continue; }
            
            else {
                computer = (int)(Math.random()*3)+1;
                
            }
            
        }
        

        

    }
}
