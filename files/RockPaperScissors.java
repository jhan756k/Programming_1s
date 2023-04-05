import java.util.*;

class RockPaperScissors
{
	public static void main(String[] args) 
	{
		int user=1;
		
		// int user=Integer.parseInt(args[0]);
		
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("입력하세요 : ");
		int user = sc.nextInt();
		int com=(int)(Math.random()*3.0+1.0);
		//*/
		
		if(user==1){
			System.out.println("당신은 가위를 냈습니다.");
		}
		else if(user==2){
			System.out.println("당신은 바위를 냈습니다.");
		}
		else if(user==3){
			System.out.println("당신은 보를 냈습니다.");
		}
		else {
			System.out.println("당신은 잘못 냈습니다.");
		}
		
		/*
		int com=(int)(Math.random()*3.0+1.0); 1, 2, 3 생성
		if(com==1){
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}
		else if(com==2){
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}
		else if(com==3){
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		else {
			System.out.println("컴퓨터는 잘못 냈습니다.");
		}
		*/

		/*
		switch(com){
			case 1:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 보를 냈습니다.");
				break;
			// default:
			//	System.out.println("컴퓨터는 잘못 냈습니다.");
			//
		}
		*/

		/*
		System.out.println("당신은\t\t"+((user==1)?"가위를":((user==2)?"바위를":((user==3)?"보를":"잘못")))+" 냇습니다.");
		// System.out.println("컴퓨터는\t"+((com==1)?"가위를":((com==2)?"바위를":((com==3)?"보를":"잘못")))+" 냇습니다.");
		//*/

		/*
		int res=(com-user+3)%3;
		if( res==0 ) System.out.println("비겼습니다.");
		else if( res==1 ) System.out.println("컴퓨터가 승리하였습니다.");
		else  System.out.println("당신이 승리하였습니다.");
		//*/
	}
}