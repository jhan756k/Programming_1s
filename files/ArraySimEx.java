// import java.util.*;

class ArraySimEx 
{
	public static void main(String[] args)
	{
		*
		int numbers[];
		numbers=new int[5];
		
		//int numbers[]=new int[5];
		
		//int numbers[]=new int[]{1,2,3,4,5};

		// int numbers[]={1,2,3,4,5};

		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		for(int i=0;i<5;i++) numbers[i]=i+1;
		//for(int i=0;i<numbers.length;i++) numbers[i]=;

		for(int i=0;i<5;i++) System.out.print(numbers[i]+" ");
		//for(int i=0;i<numbers.length;i++) System.out.print(numbers[i]+" ");
		System.out.println();
		//*/
	
		/*
		int kScore[]=new int[]{35, 56, 84, 99, 74};

		//Input
		//kScore[0]=35;
		//kScore[1]=56;
		//kScore[2]=84;
		//kScore[3]=99;
		//kScore[4]=74;
		//
		
		// Random Input
		//for(int i=0;i<kScore.length;i++) kScore[i]=(int)(Math.random()*50.0+51.0);

		// Scanner Input
		//Scanner sc=new Scanner(System.in);
		//int count=0;
		//while(count!=kScore.length)
		//{
		//	System.out.print((count+1)+" �� ���� �Է�");
		//	kScore[count++]=sc.nextInt();
		//	if(i<0 || i>100) count--;
		//}
		//

		///*
		for(int i=0;i<kScore.length;i++) System.out.print("[ "+(i+1)+"��° �л� : "+kScore[i]+" ], ");
		System.out.println();

		//for(int i=0;i<kScore.length-1;i++) System.out.print("[ "+(i+1)+"��° �л� : "+kScore[i]+" ], ");
		//System.out.println("[ "+(kScore.length)+"��° �л� : "+kScore[kScore.length-1]+" ] ");
		//*/

		/*
		int sum=0;
		for(int i=0;i<kScore.length;i++) sum+=kScore[i];
		System.out.println("\n����� "+ (double)sum/kScore.length);
		//*/
		
		/*
		int max;
		max=kScore[0];
		for(int i=1;i<kScore.length;i++) max=(max<kScore[i])?kScore[i]:max;
		System.out.println("�ִ밪�� "+ max);
		//*/

		/*
		int min;
		min=kScore[0];
		for(int i=1;i<kScore.length;i++) min=(min<kScore[i])?min:kScore[i];
		System.out.println("�ּҰ��� "+ min);
		//*/

		/*
		for(int i=0;i<kScore.length;i++) 
		{
			switch(kScore[i]/10){
				case 10 :
				case 9 : System.out.println((i+1)+"�� �л��� ���� A �Դϴ�."); break;
				case 8 : System.out.println((i+1)+"�� �л��� ���� B �Դϴ�."); break;
				case 7 : System.out.println((i+1)+"�� �л��� ���� C �Դϴ�."); break;
				case 6 : System.out.println((i+1)+"�� �л��� ���� D �Դϴ�."); break;
				default : System.out.println((i+1)+"�� �л��� ���� F �Դϴ�."); break;
			}
		}
		//*/		
	}
}