class If_VS_Switch 
{
	public static void main(String[] args) 
	{
		// Switch-case는 단일한 값의 조건을 이용하는 if-else if-else의 대용구문이다.
		// break를 이용할때와 break를 쓰지 않을때 제어의 이동에 대하여 주의할 필요가 있다.

		// 학생의 과목 점수가 100-90점이면 A, 89-80점이면 B, 79-70이면 C, 69-60점이면 D를 59점 이하 부터는 F를 출력하는 프로그램을 작성하시오.

		// 과목의 점수는 정수라고 가정하자.
		int score=94;
		//int score=(int)(Math.round(Math.random()*40.0+50.0));
		
		//int score=Integer.parseInt(args[0]);
		//int score=sc.nextInt();

		System.out.print("당신의 이번 학기 프로그래밍 점수는 \""+score+"\" 점이고 ");
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

		System.out.println("등급을 받았습니다.");
	}
}