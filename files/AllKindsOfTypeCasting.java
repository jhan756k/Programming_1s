class AllKindsOfTypeCasting
{
	public static void main(String[] args) 
	{
		/*
		// 1) �⺻ �ڷ��� ������ ����ȯ
		// boolean ���� ������ 7���� ���� ���� �Ϲ������� �ø� ��ȯ�̸� ������ ����ȯ, ���� ��ȯ�̸� ����� ����ȯ�� ���� ����ȯ�� �� �ִ�.
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
		// 2) �⺻ �ڷ����� ���� �ڷ��� ������ ����ȯ
		// �⺻ �ڷ����� �迭 ������ ����ȯ�� �Ұ����ϴ�.
		// �⺻ �ڷ����� Ŭ���� ������ ����ȯ�� ��Ģ������ �Ұ����ϴ�. ���������� �⺻ �ڷ����� Wrapper class ���̿� ����ȯ�� �����ѵ� �̰��� AutoBoxing( InBoxing - OutBoxing )�̶� �Ѵ�.
		int a=10;
		int b[]=new int[10];

		String str=new String("CHKIM");
		Integer c=new Integer(100);
		//Integer c=Integer.valueOf(100);

		//a=b;
		//b=a;

		//a=str;
		//str=a;

		//b=str; // <= 3-1���� �ٷ���
		//str=b; // <= 3-1���� �ٷ���

		//System.out.println(a+" "+c);
		//a=c; System.out.println(a+" "+c); // <= OutBoxing
		//c=a; System.out.println(a+" "+c); // <= InBoxing
		//*/

		/*
		// 3-1) ���� �ڷ��� ������ ����ȯ 1 - �迭�� �迭���� ����ȯ�� �Ұ����ϴ�. �迭�� - Ŭ���� ������ ����ȯ�� �Ұ����ϴ�. (���ܰ� �ֱ������� ��������.) 
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
		// 3-2) ���� �ڷ��� ������ ����ȯ 2 - Ŭ������ Ŭ������ ��� ��Ģ ������ ����ȯ�� �Ұ����ϴ�. ���������� ��� ���迡 �ִ� Ŭ���� ������ ����ȯ�� �����ѵ� �̰��� UpCasting - DownCasting �̶�� �θ���.
		// �ڼ� Ŭ������ �ν��Ͻ��� �θ� Ŭ������ ���������� ����Ǵ� ���� UpCasting �̶�� �Ѵ�. ���������� ����ȯ �����ϴ�. why?
		// �θ� Ŭ������ �ν��Ͻ��� �ڼ� Ŭ������ ���� ������ ����Ǵ� ���� DownCasting �̶�� �Ѵ�. ��������� ����ȯ �����ϴ�.
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

		/* instanceof ������ : ���� ������ �����ϴ� �ν��Ͻ��� ��ü�� �׽�Ʈ�ϱ� ���� ������.
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