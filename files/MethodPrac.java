class MethodPrac
{
	public static void main(String[] args) 
	{
		int x=10;
		//���� �ϳ��� argument�� �޾Ƽ� �� ������ ����ŭ �ڽ��� �̸��� �ݺ������� ����ϴ� �޼ҵ带 �ۼ��غ���.
		//printMyName(x);

		//���� �ϳ��� argument�� �޾Ƽ� �� ������ ����� ����ϴ� �޼ҵ带 �ۼ��غ���.
		/*
		System.out.print(x+"�� ������� ");
		printDivisors(x);
		System.out.println("�Դϴ�.");
		//*/

		//���� �ϳ��� argument�� �޾Ƽ� 1���� �� ���������� ���� �����ϴ� �޼ҵ带 �ۼ��غ���.
		/* 
		System.out.print("1 ���� "+x+" ���� ��� ���� ���� ");
		int res=summation(x);
		System.out.println(res+"�Դϴ�.");
		//*/
		
		//���� �ϳ��� argument�� �޾Ƽ� �� ������ ����� ������ �����ϴ� �޼ҵ带 �ۼ��غ���.
		/* 
		System.out.print(x+" �� ����� ������ ");
		int res=countDiv(x);
		System.out.println(res+" �� �Դϴ�.");
		//*/
		
		//���� �ΰ��� arguments�� �޾Ƽ� �� ������ GCD�� �����ϴ� �޼ҵ带 �ۼ��غ���.
		/*
		int y=10;
		System.out.print(x+"�� "+y+" �� �ִ� ������� ");
		//int res=getGcd1(x, y);
		int res=getGcd2(x, y);
		System.out.println(res+" �Դϴ�.");
		//*/

		//�Ǽ� n�� ���ڷ� �޾� n�� �������� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
		//	1. �ٻ簪���� n�� ������.
		//	2. 1���� ������ ���� ���� �ٻ簪�� ���Ͽ� ���ο� �ٻ簪���� �����Ѵ�.
		//	3. 2���� ������ ���ο� �ٻ簪�� 2.0���� ������.
		//	1-3 ������ ������ Ƚ����ŭ �ݺ��Ѵ�.
		
		/*
		double val=16.0; //Math.random()*10000.0;
		System.out.println("Java�� �����ϴ� �޼ҵ�� ���� "+val+" �� �������� "+Math.sqrt(val)+" �Դϴ�.");
		System.out.println("                 ���� ������ "+val+" �� �������� "+mySqrt(val)+" �Դϴ�.");
		//*/

		//���� n�� ���ڷ� �޾� �� n�� �ش��ϴ� ������ n���� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
		/*
		int dan=5;
		printGuGu(dan);
		//for(int i=1;i<=9;i++) printGuGu(i);
		//*/


		//���������� ���� a�� ���� d�� n��° ���� �ǹ��ϴ� ������ ���ڸ� �޾Ƽ� �� ������ n��° ���� ���� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
		/*
		int a, d, n;
		a=10;
		d=3;
		n=10;
		System.out.print(getDiff(a,d,n));
		//for(int i=1;i<=n;i=i+1) System.out.print(getDiff(a,d,i)+" ");
		//*/

		//���� n�� m�� ���ڷ� �޾� �� �� ���� ��� ������� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
		/*
		int m, n;
		m=100;
		n=50;
		printAllGcd(m,n);
		//*/

		//���� n�� m�� ���ڷ� �޾� �� �� ���� �ּ� ������� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.		
		/*
		int m, n;
		m=100;
		n=50;
		//System.out.println(m+" �� "+n+" �� �ִ� ������� "+getGcd1(m,n)+" �̰�, �ּ� ������� "+m*n/getGcd1(m,n)+" �Դϴ�.");
		//System.out.println(m+" �� "+n+" �� �ִ� ������� "+getGcd2(m,n)+" �̰�, �ּ� ������� "+m*n/getGcd2(m,n)+" �Դϴ�.");
		//System.out.println(m+" �� "+n+" �� �ִ� ������� "+getGcd1(m,n)+" �̰�, �ּ� ������� "+getLcm1(m,n)+" �Դϴ�.");
		//System.out.println(m+" �� "+n+" �� �ִ� ������� "+getGcd2(m,n)+" �̰�, �ּ� ������� "+getLcm2(m,n)+" �Դϴ�."); // ���� ���̴� �����ΰ�?
		//*/

		// Method Overloading <= �� �����غ���.
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
		for(int i=1;i<=times;i++) System.out.println("��âȯ"+" <= "+i+"��°");
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
		// System.out.println(number+"�� ������ ���ϱ�");
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
		System.out.println("�� ������ ���� ���� �����ϴ� �޼ҵ��Դϴ�.");
		return x+y;
	}
	//*/

	/*
	public static int plus(double x, double y)
	{
		System.out.println("�� �Ǽ��� ���� ���� �����ϴ� �޼ҵ��Դϴ�.");
		return x+y;
	}
	//*/
}