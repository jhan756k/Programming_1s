import java.util.*;

class RockPaperScissors2
{
	public static void main(String[] args) 
	{
		
		int com, user, res;
		int result[]=new int[3];
		
		Scanner a=new Scanner(System.in);
		System.out.println("1, 2, 3 �߿� �ϳ��� �Է��ϼ���. 1�� ����, 2�� ����, 3�� ���� �ǹ��մϴ�.\n�Է��� �����ϰ��� �Ѵٸ� -1�� �Է��ϼ���");
		
		while(true){
			System.out.print("����, ���� �� : "); user=a.nextInt();
			if(user == -1){ break; }
			else if(user<1 || user>3){
				System.out.println("\n�߸� �Է��ϼ̽��ϴ�. 1, 2, 3 �߿� �ϳ��� �Է��ϼ���. 1�� ����, 2�� ����, 3�� ���� �ǹ��մϴ�.\n�Է��� �����ϰ��� �Ѵٸ� -1�� �Է��ϼ���");
				continue;
			}			
			else {
				com=(int)(Math.random()*3.0+1.0);
				System.out.println("�����\t\t"+((user==1)?"������":((user==2)?"������":((user==3)?"����":"�߸�")))+" �����ϴ�.");
				System.out.println("��ǻ�ʹ�\t"+((com==1)?"������":((com==2)?"������":((com==3)?"����":"�߸�")))+" �����ϴ�.");
				//System.out.print("��ǻ�ʹ� \""+name(com)+"\"�� ���� ����� \""+name(user)+"\"�� �����ϴ�. ");
				//System.out.print("[ ��ǻ�� : \""+name(com)+"\", �÷��̾� :  \""+name(user)+"\" ] => ");
			}
			res=(com-user+3)%3;
			result[res]++;
			
			if( res==0 ) System.out.println("�����ϴ�.");
			else if( res==1 ) System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
			else System.out.println("����� �¸��Ͽ����ϴ�.");
			System.out.println("\n1, 2, 3 �߿� �ϳ��� �Է��ϼ���. 1�� ����, 2�� ����, 3�� ���� �ǹ��մϴ�.\n�Է��� �����ϰ��� �Ѵٸ� -1�� �Է��ϼ���");
		}

		System.out.println("\n"+result[2]+" ��, "+result[1]+" ��, "+result[0]+" ���º� �Դϴ�.");
	}

	/*
	public static String name(int x)
	{
		if(x==0) return "����";	
		else if(x==1) return "����";
		else if(x==2) return "��";
		else return "";
	}
	//*/
}