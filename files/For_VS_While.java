import java.util.*;
//import java.io.*;

class For_VS_While 
{
	public static void main(String[] args) // throws IOException
	{
		// 1-10까지의 숫자를 출력하는 프로그램을 for와 while을 이용하여 각각 작성해 보자.
		/*
		int i;

		for(i=1;i<=10;i++){
			System.out.print(i + " ");
		}
		//*/

		// 두 정수의 GCD를 구하여 출력하는 프로그램을 while과 for를 이용하여 각각 작성해 보자.
		/*
		int k,l;
		k=6;
		l=48;

		int i, small=k>=l?l:k, gcd=1;
		System.out.print(k+"과 "+l+"의 최대 공약수는 => ");
		for(i=1;i<=small;i++) if(k%i==0 && l%i==0) gcd=i;
		System.out.println(gcd+" 입니다.");
		/*//

		// 두 정수의 GCD를 유클리드 호제법을 이용하여 구한 후 출력하는 프로그램을 while과 for를 이용하여 각각 작성해 보자.
		/*
		int k,l;
		k=6;
		l=48;

		System.out.print(k+"과 "+l+"의 최대 공약수는 => ");
		while(l!=0){
			if(k>=l) k=k-l; // k=k%l;
			else { int temp=k; k=l; l=temp;	}
		}
		System.out.println(k+" 입니다.");
		//*/

		// n이 소수인지 아닌지를 판단하여 출력하는 프로그램을 while과 for를 이용하여 각각 작성해 보자.
		/*
		int i, divs, n=101;
		divs=0;
		for(i=1;i<=n;i++) if(n%i==0) divs++;
		if(divs==2) System.out.println(n+" 은 소수입니다.");
		else System.out.println(n+" 은 소수가 아닙니다.");
		//*/

		// n이 소수인지 아닌지 판단하여 출력하는 프로그램을 break를 사용하여 개선하시오.

		// Scanner를 이용하여 5명으로 구성된 반의 프로그래밍 과목 중간고사 성적(0부터 100사이의 정수)을 입력 받아 평균을 구해 출력하는 프로그램을 작성해 보자.
		/*
		Scanner sc=new Scanner(System.in);
		
		final int NUM=5;
		int score, totalScore=0;
		for(int i=1;i<=NUM;i++) {
			System.out.print(i+"번 학생의 점수를 입력하세요 : ");
			score=sc.nextInt();
			if(score<0 || score>100) { System.out.println("점수는 1 - 100 사이의 정수 입니다."); i--; continue; }
			else totalScore+=score;
		}
		System.out.println("\n"+NUM+"명 학생 점수의 총합은 "+totalScore+"이고, 평균 점수는 "+(double)totalScore/NUM+"입니다.");
		//*/

		/* 재미와 참고를 위해
		Scanner sc=new Scanner(System.in);
		sc = new Scanner(new File("score.txt"));
		// if(args.length == 1) sc = new Scanner(new File(args[0]));
		final int NUM=2; // 8장 예외 처리를 기대하게
		double score, totalScore=0.0;
		for(int i=1;i<=NUM;i++) {
			System.out.print("번호 읽기 "); sc.nextInt();
			System.out.print("이름 읽기 "); sc.next();
			System.out.print("점수 읽기 "); score=sc.nextDouble();
			System.out.println(score);
			totalScore+=score;
		}
		System.out.println("\n"+NUM+"명 학생 점수의 총합은 "+totalScore+"이고, 평균 점수는 "+totalScore/NUM+"입니다.");
		//*/

		// 0 또는 음수가 입력되기 전까지 입력된 모든 숫자 중 짝수와 홀수의 개수는 각각 몇 개인지를 출력하는 프로그램을 작성하시오. => do-while로 재 작성해보자
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
		System.out.println(tCount+"개 숫자 중 짝수는 "+eCount+" 개, 홀수는 "+oCount+" 개 입니다.");
		//*/
	}
}