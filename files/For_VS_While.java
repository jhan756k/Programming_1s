import java.util.*;
//import java.io.*;

class For_VS_While 
{
	public static void main(String[] args) // throws IOException
	{
		// 1-10������ ���ڸ� ����ϴ� ���α׷��� for�� while�� �̿��Ͽ� ���� �ۼ��� ����.
		/*
		int i;

		for(i=1;i<=10;i++){
			System.out.print(i + " ");
		}
		//*/

		// �� ������ GCD�� ���Ͽ� ����ϴ� ���α׷��� while�� for�� �̿��Ͽ� ���� �ۼ��� ����.
		/*
		int k,l;
		k=6;
		l=48;

		int i, small=k>=l?l:k, gcd=1;
		System.out.print(k+"�� "+l+"�� �ִ� ������� => ");
		for(i=1;i<=small;i++) if(k%i==0 && l%i==0) gcd=i;
		System.out.println(gcd+" �Դϴ�.");
		/*//

		// �� ������ GCD�� ��Ŭ���� ȣ������ �̿��Ͽ� ���� �� ����ϴ� ���α׷��� while�� for�� �̿��Ͽ� ���� �ۼ��� ����.
		/*
		int k,l;
		k=6;
		l=48;

		System.out.print(k+"�� "+l+"�� �ִ� ������� => ");
		while(l!=0){
			if(k>=l) k=k-l; // k=k%l;
			else { int temp=k; k=l; l=temp;	}
		}
		System.out.println(k+" �Դϴ�.");
		//*/

		// n�� �Ҽ����� �ƴ����� �Ǵ��Ͽ� ����ϴ� ���α׷��� while�� for�� �̿��Ͽ� ���� �ۼ��� ����.
		/*
		int i, divs, n=101;
		divs=0;
		for(i=1;i<=n;i++) if(n%i==0) divs++;
		if(divs==2) System.out.println(n+" �� �Ҽ��Դϴ�.");
		else System.out.println(n+" �� �Ҽ��� �ƴմϴ�.");
		//*/

		// n�� �Ҽ����� �ƴ��� �Ǵ��Ͽ� ����ϴ� ���α׷��� break�� ����Ͽ� �����Ͻÿ�.

		// Scanner�� �̿��Ͽ� 5������ ������ ���� ���α׷��� ���� �߰����� ����(0���� 100������ ����)�� �Է� �޾� ����� ���� ����ϴ� ���α׷��� �ۼ��� ����.
		/*
		Scanner sc=new Scanner(System.in);
		
		final int NUM=5;
		int score, totalScore=0;
		for(int i=1;i<=NUM;i++) {
			System.out.print(i+"�� �л��� ������ �Է��ϼ��� : ");
			score=sc.nextInt();
			if(score<0 || score>100) { System.out.println("������ 1 - 100 ������ ���� �Դϴ�."); i--; continue; }
			else totalScore+=score;
		}
		System.out.println("\n"+NUM+"�� �л� ������ ������ "+totalScore+"�̰�, ��� ������ "+(double)totalScore/NUM+"�Դϴ�.");
		//*/

		/* ��̿� ������ ����
		Scanner sc=new Scanner(System.in);
		sc = new Scanner(new File("score.txt"));
		// if(args.length == 1) sc = new Scanner(new File(args[0]));
		final int NUM=2; // 8�� ���� ó���� ����ϰ�
		double score, totalScore=0.0;
		for(int i=1;i<=NUM;i++) {
			System.out.print("��ȣ �б� "); sc.nextInt();
			System.out.print("�̸� �б� "); sc.next();
			System.out.print("���� �б� "); score=sc.nextDouble();
			System.out.println(score);
			totalScore+=score;
		}
		System.out.println("\n"+NUM+"�� �л� ������ ������ "+totalScore+"�̰�, ��� ������ "+totalScore/NUM+"�Դϴ�.");
		//*/

		// 0 �Ǵ� ������ �ԷµǱ� ������ �Էµ� ��� ���� �� ¦���� Ȧ���� ������ ���� �� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. => do-while�� �� �ۼ��غ���
		/*
		Scanner sc=new Scanner(System.in);
		int n, tCount=0, eCount=0, oCount=0;

		n=100;
		while(n>0) {
			n=sc.nextInt();
			if(n>=1) {
				tCount++;
				if(n%2==0) eCount++;
				else oCount++;
			}
		}
		System.out.println(tCount+"�� ���� �� ¦���� "+eCount+" ��, Ȧ���� "+oCount+" �� �Դϴ�.");
		//*/
	}
}