class MethodPrac
{
	public static void main(String[] args) 
	{
		int x=10;
		//정수 하나를 argument로 받아서 그 정수의 값만큼 자신의 이름을 반복적으로 출력하는 메소드를 작성해보자.
		//printMyName(x);

		//정수 하나를 argument로 받아서 그 정수의 약수를 출력하는 메소드를 작성해보자.
		/*
		System.out.print(x+"의 약수들은 ");
		printDivisors(x);
		System.out.println("입니다.");
		//*/

		//정수 하나를 argument로 받아서 1부터 그 정수까지의 합을 리턴하는 메소드를 작성해보자.
		/* 
		System.out.print("1 부터 "+x+" 까지 모든 수의 합은 ");
		int res=summation(x);
		System.out.println(res+"입니다.");
		//*/
		
		//정수 하나를 argument로 받아서 그 정수의 약수의 갯수를 리턴하는 메소드를 작성해보자.
		/* 
		System.out.print(x+" 의 약수의 개수는 ");
		int res=countDiv(x);
		System.out.println(res+" 개 입니다.");
		//*/
		
		//정수 두개를 arguments로 받아서 두 정수의 GCD를 리턴하는 메소드를 작성해보자.
		/*
		int y=10;
		System.out.print(x+"와 "+y+" 의 최대 공약수는 ");
		//int res=getGcd1(x, y);
		int res=getGcd2(x, y);
		System.out.println(res+" 입니다.");
		//*/

		//실수 n을 인자로 받아 n의 제곱근을 리턴하는 메소드를 작성하시오.
		//	1. 근사값으로 n을 나눈다.
		//	2. 1에서 구해진 수와 원래 근사값을 더하여 새로운 근사값으로 설정한다.
		//	3. 2에서 구해진 새로운 근사값을 2.0으로 나눈다.
		//	1-3 과정을 적당한 횟수만큼 반복한다.
		
		/*
		double val=16.0; //Math.random()*10000.0;
		System.out.println("Java가 제공하는 메소드로 구한 "+val+" 의 제곱근은 "+Math.sqrt(val)+" 입니다.");
		System.out.println("                 직접 구현한 "+val+" 의 제곱근은 "+mySqrt(val)+" 입니다.");
		//*/

		//정수 n을 인자로 받아 그 n에 해당하는 구구단 n단을 출력하는 메소드를 작성하시오.
		/*
		int dan=5;
		printGuGu(dan);
		//for(int i=1;i<=9;i++) printGuGu(i);
		//*/


		//등차수열의 초항 a와 공차 d와 n번째 항을 의미하는 세개의 인자를 받아서 그 수열의 n번째 항의 값을 리턴하는 메소드를 작성하시오.
		/*
		int a, d, n;
		a=10;
		d=3;
		n=10;
		System.out.print(getDiff(a,d,n));
		//for(int i=1;i<=n;i=i+1) System.out.print(getDiff(a,d,i)+" ");
		//*/

		//정수 n과 m을 인자로 받아 그 두 수의 모든 공약수를 출력하는 메소드를 작성하시오.
		/*
		int m, n;
		m=100;
		n=50;
		printAllGcd(m,n);
		//*/

		//정수 n과 m을 인자로 받아 그 두 수의 최소 공배수를 리턴하는 메소드를 작성하시오.		
		/*
		int m, n;
		m=100;
		n=50;
		//System.out.println(m+" 과 "+n+" 의 최대 공약수는 "+getGcd1(m,n)+" 이고, 최소 공배수는 "+m*n/getGcd1(m,n)+" 입니다.");
		//System.out.println(m+" 과 "+n+" 의 최대 공약수는 "+getGcd2(m,n)+" 이고, 최소 공배수는 "+m*n/getGcd2(m,n)+" 입니다.");
		//System.out.println(m+" 과 "+n+" 의 최대 공약수는 "+getGcd1(m,n)+" 이고, 최소 공배수는 "+getLcm1(m,n)+" 입니다.");
		//System.out.println(m+" 과 "+n+" 의 최대 공약수는 "+getGcd2(m,n)+" 이고, 최소 공배수는 "+getLcm2(m,n)+" 입니다."); // 둘의 차이는 무엇인가?
		//*/

		// Method Overloading <= 잘 생각해보자.
		/*
		int a=10, b=20;
		//double a=10.0, b=20.0;
		System.out.println(a);

		//System.out.println(plus(a,b));

		//System.out.println(plus('A',15));
		//System.out.println(plus(25,15.0));
		//System.out.println(plus(46.7f,15));
		//*/
	}

	public static void printMyName(int times)
	{	
		for(int i=1;i<=times;i++) System.out.println("김창환"+" <= "+i+"번째");
		//return
	}

	public static void printDivisors(int number)
	{	
		for(int i=1;i<=number;i++) if(number%i==0) System.out.print(i+" ");
		//return
	}

	public static int summation(int number)
	{	
		int result=0;
		for(int i=1;i<=number;i++) result+=i;
		return result;
	}

	public static int countDiv(int number)
	{	
		int count=0;
		for(int i=1;i<=number;i++) if(number%i==0) count++;
		return count;
	}

	public static int getGcd1(int n1, int n2)
	{	
		int res=1, small=n1>=n2?n2:n1;
		for(int i=1;i<=small;i++) if(n1%i==0 && n2%i==0) res=i;
		//for(int i=small;i>=1;i--) if(n1%i==0 && n2%i==0) { res=i; break; }
		return res;
	}

	public static int getGcd2(int n1, int n2)
	{	
		///*
		while(n1!=0 && n2!=0) {
			if(n1>=n2) n1=n1-n2; //n1%=n2;
			else n2=n2-n1; //n2%=n1;
		}
		if(n1==0) return n2;
		else return n1;
		//*/

		/*
		while(n2!=0) {
			if(n1>=n2) n1=n1-n2;  //n1%=n2;
			else { int t=n1; n1=n2; n2=t; }
		}
		return n1;
		//*/

		/*
		if(n2==0) return n1;
		else return getGcd2(n2, n1%n2);
		//*/
	}

	public static double mySqrt(double number)
	{
		// System.out.println(number+"의 제곱근 구하기");
		final int TRIAL=100;

		double app=number;
		for(int i=1;i<=TRIAL;i++){
			double temp=number/app;
			app=app+temp;
			app=app/2.0;
		}
		return app;
	}

	public static void printGuGu(int d)
	{
		for(int i=1;i<=9;i++)
			System.out.print(d+"*"+i+"="+(d*i)+" ");
			//System.out.printf("%2d *%2d = %2d   ",d,i,(d*i));
		System.out.println();
		//return ;
	}
	
	public static int getDiff(int a,int d,int n)
	{
		int res=a;
		for(int i=2;i<=n;i++) res+=d;
		return res;
	}

	public static void printAllGcd(int a, int b)
	{
		int small=(a>=b)?b:a;
		for(int i=1;i<=small;i++) if(a%i==0 && b%i==0) System.out.print(i+" ");
		System.out.println();
		//return;
	}

	public static int getLcm1(int x, int y)
	{
		int gcd=getGcd1(x,y);
		int v1=x/gcd;
		int v2=y/gcd;
		return v1*v2*gcd;
	}

	public static int getLcm2(int x, int y)
	{
		return x*y/getGcd1(x,y);
	}
	
	/*
	public static int plus(int x, int y)
	{
		System.out.println("두 정수의 합을 구해 리턴하는 메소드입니다.");
		return x+y;
	}
	//*/

	/*
	public static int plus(double x, double y)
	{
		System.out.println("두 실수의 합을 구해 리턴하는 메소드입니다.");
		return x+y;
	}
	//*/
}