import java.util.*;

class RockPaperScissors2
{
	public static void main(String[] args) 
	{
		
		int com, user, res;
		int result[]=new int[3];
		
		Scanner a=new Scanner(System.in);
		System.out.println("1, 2, 3 중에 하나를 입력하세요. 1은 가위, 2는 바위, 3은 보를 의미합니다.\n입력을 종료하고자 한다면 -1을 입력하세요");
		
		while(true){
			System.out.print("가위, 바위 보 : "); user=a.nextInt();
			if(user == -1){ break; }
			else if(user<1 || user>3){
				System.out.println("\n잘못 입력하셨습니다. 1, 2, 3 중에 하나를 입력하세요. 1은 가위, 2는 바위, 3은 보를 의미합니다.\n입력을 종료하고자 한다면 -1을 입력하세요");
				continue;
			}			
			else {
				com=(int)(Math.random()*3.0+1.0);
				System.out.println("당신은\t\t"+((user==1)?"가위를":((user==2)?"바위를":((user==3)?"보를":"잘못")))+" 냇습니다.");
				System.out.println("컴퓨터는\t"+((com==1)?"가위를":((com==2)?"바위를":((com==3)?"보를":"잘못")))+" 냇습니다.");
				//System.out.print("컴퓨터는 \""+name(com)+"\"를 내고 당신은 \""+name(user)+"\"를 냇습니다. ");
				//System.out.print("[ 컴퓨터 : \""+name(com)+"\", 플레이어 :  \""+name(user)+"\" ] => ");
			}
			res=(com-user+3)%3;
			result[res]++;
			
			if( res==0 ) System.out.println("비겼습니다.");
			else if( res==1 ) System.out.println("컴퓨터가 승리하였습니다.");
			else System.out.println("당신이 승리하였습니다.");
			System.out.println("\n1, 2, 3 중에 하나를 입력하세요. 1은 가위, 2는 바위, 3은 보를 의미합니다.\n입력을 종료하고자 한다면 -1을 입력하세요");
		}

		System.out.println("\n"+result[2]+" 승, "+result[1]+" 패, "+result[0]+" 무승부 입니다.");
	}

	/*
	public static String name(int x)
	{
		if(x==0) return "가위";	
		else if(x==1) return "바위";
		else if(x==2) return "보";
		else return "";
	}
	//*/
}