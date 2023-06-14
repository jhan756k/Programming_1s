class AllKindsOfTypeCasting
{
	public static void main(String[] args) 
	{
		/*
		// 1) 기본 자료형 사이의 형변환
		// boolean 형을 제외한 7가지 형에 대해 일반적으로 올림 변환이면 묵시적 형변환, 내림 변환이면 명시적 형변환을 통해 형변환할 수 있다.
		char a='A';
		int b=10;
		double c=25.37D;

		float x=-123.45f;
		//x=a;
		//x=b;
		//x=c;
		System.out.println(x);
		//*/

		/*
		// 2) 기본 자료형과 참조 자료형 사이의 형변환
		// 기본 자료형과 배열 간에는 형변환이 불가능하다.
		// 기본 자료형과 클래스 간에는 형변환이 원칙적으로 불가능하다. 예외적으로 기본 자료형과 Wrapper class 사이에 형변환이 가능한데 이것을 AutoBoxing( InBoxing - OutBoxing )이라 한다.
		int a=10;
		int b[]=new int[10];

		String str=new String("CHKIM");
		Integer c=new Integer(100);
		//Integer c=Integer.valueOf(100);

		//a=b;
		//b=a;

		//a=str;
		//str=a;

		//b=str; // <= 3-1에서 다루자
		//str=b; // <= 3-1에서 다루자

		//System.out.println(a+" "+c);
		//a=c; System.out.println(a+" "+c); // <= OutBoxing
		//c=a; System.out.println(a+" "+c); // <= InBoxing
		//*/

		/*
		// 3-1) 참조 자료형 사이의 형변환 1 - 배열과 배열간의 형변환은 불가능하다. 배열과 - 클래스 간에도 형변환은 불가능하다. (예외가 있긴하지만 무시하자.) 
		char a[]=new char[5];
		int b[]=new int[5];
		double c[]=new double[5];

		String str=new String("CHKIM");

		//a=b;
		//b=a;
		//b=c;
		//c=b;
		//a=c;
		//c=a;

		//str=a;
		//a=str;
		//*/

		/*
		// 3-2) 참조 자료형 사이의 형변환 2 - 클래스와 클래스의 경우 원칙 적으로 형변환이 불가능하다. 예외적으로 상속 관계에 있는 클래스 간에는 형변환이 가능한데 이것을 UpCasting - DownCasting 이라고 부른다.
		// 자손 클래스의 인스턴스가 부모 클래스의 참조변수로 연결되는 것을 UpCasting 이라고 한다. 묵시적으로 형변환 가능하다. why?
		// 부모 클래스의 인스턴스가 자손 클래스의 참조 변수로 연결되는 것을 DownCasting 이라고 한다. 명시적으로 형변환 가능하다.
		String str=new String("CHKIM");
		Integer i=Integer.valueOf(100);
		Object obj=new Object();

		//str=i;
		//i=str;

		//System.out.println(obj+" , "+str);
		//obj=str; // <= UpCasting
		//str=obj; // <= DownCasting
		//str=(String)obj; // <= DownCasting Using cast Operator
		//System.out.println(obj+" , "+str);
		
		//System.out.println(obj+" , "+i);
		//obj=i;   // <= UpCasting
		//i=obj;   // <= DownCasting
		//i=(Integer)obj;   // <= DownCasting Using cast Operator
		//System.out.println(obj+" , "+i);
		//*/

		/* instanceof 연산자 : 참조 변수가 참조하는 인스턴스의 실체를 테스트하기 위한 연산자.
		Object obj=new Object();
		//Object obj=new CircleMini();
		//Object obj=new PartialCircleMini();

		System.out.println( obj instanceof Object );
		System.out.println( obj instanceof CircleMini );
		System.out.println( obj instanceof PartialCircleMini );
		//*/		
		
		/* Polymorphism
		Object objArr[]=new Object[]{new Object(), new String("Hello JAVA"), Integer.valueOf(2023), Double.valueOf(2.71828182846) 
			//, Circle(2.5), PartialCircle(45.0)
		};
		for(int it=0; it<objArr.length; it++) System.out.println( objArr[it].getClass().getName()+" => "+objArr[it]);
		//*/		
	}
}

/*
class CircleMini extends Object
{
}

class PartialCircleMini extends CircleMini
{
}
//*/