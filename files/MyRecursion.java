class MyRecursion 
{
	public static void main(String[] args) 
	{
		/*
		System.out.printf("*********************************************************\n");
		long startMilliTime, endMilliTime, startNanoTime, endNanoTime;
		startMilliTime = System.currentTimeMillis();
		startNanoTime = System.nanoTime();
		//*/
		
		/*
		recurMe1(0);
		System.out.println();
		//*/
		
		/*
		recurMe2(0);
		System.out.println();
		//*/

		/*
		int num=10000;//3000;//8500;
		System.out.println("sumIter      : "+sumIter(num));
		//System.out.println("sumRecur     : "+sumRecur(num));
		//System.out.println("sumRecurTail : "+sumRecurTail(num,0));
		//System.out.println("sumRecur     : "+sumRecur(num));
		//*/

		/*
		int num=5;//25;
		//System.out.println("factIter      : "+factIter(num));
		//System.out.println("factRecur     : "+factRecur(num));
		//System.out.println("factRecurTail : "+factRecurTail(num,1L));
		//*/
		
		/*
		int n=10, k=3;
		//int n=30, k=15;
		System.out.println("biCoefIter  : "+biCoefIter(n,k));
		//System.out.println("biCoefRecur : "+biCoefRecur1(n,k)); // recursion
		//System.out.println("biCoefRecur : "+biCoefRecur2(n,k)); // recursion with Memoization
		//*/

		/*int a=4, b=60;
		System.out.println("getGcdIter  : "+getGcdIter(a,b));
		System.out.println("getGcdRecur : "+getGcdRecur(a,b));
		//*/

		/*
		int num=50;
		printBin(num, 31);  // CF toBinary.java
		System.out.println();
		//*/

		/*
		int num=2147483647;
		//for(int num=1;num<=20;num++) 
		{
			System.out.println(num);
			System.out.print("2���� => ");
			printNotation(num,2); 
			System.out.print(": ");
			printNotation2(num,2);
			System.out.println();

			System.out.print("8���� => ");
			printNotation(num,8);
			System.out.print(": ");
			printNotation2(num,8);
			System.out.println();

			System.out.print("16���� => ");
			printNotation(num,16);
			System.out.print(": ");
			printNotation2(num,16);
			System.out.println();
		}
		//*/

		/*
		endMilliTime = System.currentTimeMillis();
		endNanoTime = System.nanoTime();	
		System.out.printf("\n=> %5d �и���, \t %5d ������ �Ҹ��.\n", (endMilliTime - startMilliTime),(endNanoTime - startNanoTime));
		System.out.printf("*********************************************************\n\n");
		//*/
	}
	
	public static void recurMe1(int num)
	{
		System.out.print(num+" ");
		if (num < 4) recurMe1(num+1);
	}
	
	public static void recurMe2(int num)
	{		
		if (num < 4) recurMe2(num+1);
		System.out.print(num+" ");
	}

	public static int sumIter(int n)
	{
		int res=0;
		for(int i=0;i<=n;i++) res+=i;

		return res;
	}

	public static int sumRecur(int n)
	{
		if(n==1) return 1;
		else return n+sumRecur(n-1);
	}

	public static int sumRecurTail(int n, int acc)
	{
		if(n==1) return acc+1;
		else return sumRecurTail(n-1,n+acc);
	}

	public static long factIter(int n)
	{
		long res=1L;
		for(int i=1;i<=n;i++){
			res *= i;
		}
		return res;
	}

	public static long factRecur(int n)
	{
		if(n==0) return 1L;
		else return n*factRecur(n-1);
	}

	public static long factRecurTail(int n, long acc)
	{
		if(n==0) return acc;
		else return factRecurTail(n-1, n*acc);
	}

	public static int biCoefIter(int n, int k)
	{
		int res1=1, res2=1;

		if(k==0 || k==n) return 1;
		else {
			for(int i=n;i>=n-k+1;i--){
				res1 *= i;
			}
			for(int i=k;i>=1;i--){
				res2 *= i;
			}
		}
		//System.out.println(res1+" "+res2);
		return res1/res2;
	}

	public static int biCoefRecur1(int n, int k) // �Ϲ����� recursion
	{
		if(k==0 || k==n) return 1;
		else return biCoefRecur1(n-1, k-1) + biCoefRecur1(n-1, k);
	}
	
	final static int NUM=200;
	static int memo[][]=new int[NUM][NUM];
	public static int biCoefRecur2(int n, int k) // recursion with Memoization
	{
		if(memo[n][k]>0) return memo[n][k];
		if(k==0 || k==n) { memo[n][k]=1; return memo[n][k]; }
		else {
			memo[n][k]=biCoefRecur2(n-1, k-1) + biCoefRecur2(n-1, k);
			return memo[n][k];
		}
	}

	public static int getGcdIter(int a, int b)
	{
		if(a<b) {int t=a; a=b; b=t;}
		while(b!=0){
			int t=a%b; a=b; b=t;
		}
		return a;
	}

	public static int getGcdRecur(int a, int b)
	{
		if(b==0) return a;
		else return getGcdRecur(b, a%b);
	}

	public static void printBin(int n, int nTh)
	{
		if(nTh==-1) return;
		else {
			int t=mySquare(nTh);
			System.out.print(n/t);
			if(nTh%4==0) System.out.print(" ");
			printBin(n%t, nTh-1);			
		}
	}

	public static void printOctal(int n)
	{
		///*
		if(n>=8) {
			printOctal(n/8);
			System.out.print(n%8+" ");
		}
		else System.out.print(n+" ");
		//*/
		
		/*
		if(n/8>0) printOctal(n/8);
		System.out.print(n%8+" ");
		//*/
	}

	public static void printNotation(int n, int radix)
	{
		if(radix!=2 && radix!=8 && radix!=16) { System.out.println("Wrong Radix, plz use 2 or 8 or 16" ); return; } // <= 2, 8, 16 �̾�߸� �ϴ°�?
		if(n>=radix) {
			printNotation(n/radix, radix);
			if(radix!=16) System.out.print(n%radix+" ");
			else System.out.print(n%radix==15?"F ":n%radix==14?"E ":n%radix==13?"D ":n%radix==12?"C ":n%radix==11?"B ":n%radix==10?"A ":(n%radix)+" ");
			// else System.out.print(n%radix==15?"F ":n%radix==14?"E ":n%radix==13?"D ":n%radix==12?"C ":n%radix==11?"B ":n%radix==10?"A ":(n%radix)+" "); // <= �� ���� ������?
		}
		else System.out.print(n==15?"F ":n==14?"E ":n==13?"D ":n==12?"C ":n==11?"B ":n==10?"A ":(n+" "));
		//else System.out.print(n==15?"F ":n==14?"E ":n==13?"D ":n==12?"C ":n==11?"B ":n==10?"A ":(n+" "));
	}

	public static void printNotation2(int n, int radix)
	{
		if(radix!=2 && radix!=8 && radix!=16) { System.out.println("Wrong Radix, plz use 2 or 8 or 16" ); return; }
		if(n>=radix) {			
			if(radix!=16) System.out.print(n%radix+" ");
			else System.out.print(n%radix==15?"F ":n%radix==14?"E ":n%radix==13?"D ":n%radix==12?"C ":n%radix==11?"B ":n%radix==10?"A ":(n%radix)+" ");
			// else System.out.print(n%radix==15?"F ":n%radix==14?"E ":n%radix==13?"D ":n%radix==12?"C ":n%radix==11?"B ":n%radix==10?"A ":(n%radix)+" ");
			printNotation2(n/radix, radix);
		}
		else System.out.print(n==15?"F ":n==14?"E ":n==13?"D ":n==12?"C ":n==11?"B ":n==10?"A ":(n+" "));
		//else System.out.print(n==15?"F ":n==14?"E ":n==13?"D ":n==12?"C ":n==11?"B ":n==10?"A ":(n+" "));
	}

	public static int mySquare(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
			res *= 2;
		return res;
	}
}