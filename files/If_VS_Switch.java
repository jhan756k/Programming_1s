class If_VS_Switch 
{
	public static void main(String[] args) 
	{
		// Switch-case�� ������ ���� ������ �̿��ϴ� if-else if-else�� ��뱸���̴�.
		// break�� �̿��Ҷ��� break�� ���� ������ ������ �̵��� ���Ͽ� ������ �ʿ䰡 �ִ�.

		// �л��� ���� ������ 100-90���̸� A, 89-80���̸� B, 79-70�̸� C, 69-60���̸� D�� 59�� ���� ���ʹ� F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		// ������ ������ ������� ��������.
		int score=94;
		//int score=(int)(Math.round(Math.random()*40.0+50.0));
		
		//int score=Integer.parseInt(args[0]);
		//int score=sc.nextInt();

		System.out.print("����� �̹� �б� ���α׷��� ������ \""+score+"\" ���̰� ");
		//int score2=score/10;

		///*
		if(score >= 90) System.out.print("A");
		else if(score >= 80) System.out.print("B");
		else if(score >= 70) System.out.print("C");
		else if(score >= 60) System.out.print("D");
		else  System.out.print("F");
		//*/

		/*
		//System.out.println(score2);
		if(score2==10) System.out.println("A");
		else if(score2 == 9) System.out.print("A");
		else if(score2 == 8) System.out.print("B");
		else if(score2 == 7) System.out.print("C");
		else if(score2 == 6) System.out.print("D");
		else System.out.print("F");
		//*/


		/*
		switch(score2)
		{
			case 10 :
				System.out.print("A");
				// break;
			case 9 :
				System.out.print("A");
				// break;
			case 8 :
				System.out.print("B");
				// break;
			case 7 :
				System.out.print("C");
				// break;
			case 6 :
				System.out.print("D");
				// break;
			default :
				System.out.print("F");
				// break;
		}
		//*/


		/*
		System.out.print((score2==10||score2==9)?"A":score2==8?"B":score2==7?"C":score2==6?"D":"F");
		//*/

		System.out.println("����� �޾ҽ��ϴ�.");
	}
}