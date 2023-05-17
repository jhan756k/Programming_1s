class Circle042
{
	private double radius;
	private double pi=3.14;
	
	private static int totalCounter;
	private int instCounter;

	/*
	public Circle042() {
		totalCounter++;
		instCounter=totalCounter;
		System.out.println(instCounter+"��° �ν��Ͻ� ������.");
		radius=1.0;
	}
	//*/

	/*
	private Circle042()
	{
		totalCounter++;
		instCounter=totalCounter;
		System.out.println(instCounter+"��° �ν��Ͻ� ������.");
		radius=1.0;
	}

	public static Circle042 getInstance() {
		return new Circle042();
	}
	//*/

	/*
	private Circle042()
	{
		instCounter=totalCounter;
		System.out.println(instCounter+"��° �ν��Ͻ� ������.");
		radius=1.0;
	}

	public static Circle042 getInstance() {
		totalCounter++;
		if(totalCounter<=3) return new Circle042();
		else {
			System.out.println("�� Ŭ������ �ν��Ͻ��� �� ���� ���� �� �ֽ��ϴ�. ");
			return null;
		}
	}
	//*/

	public void setRadius(double r)
	{
		if(r<=0.0) {
			System.out.println("�������� ���� �Ǽ� �����θ� ��Ʈ�� �� �ֽ��ϴ�. �⺻ ������ �� 1.0���� ��Ʈ�մϴ�.");
			radius=1.0;
		}
		else radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}

	public void setPi(double p)
	{
		/*double temp=pi>=p?pi-p:p-pi;
		if(temp>=0.0001 && temp<=0.01) pi=p;
		else pi=pi;
		*/

		/*
		if(p>=3.14 && p<=3.15) pi=p;
		else { 
			System.out.println("������ �������� ����Ȯ�Ͽ� �׳� 3.14�� ��Ʈ�մϴ�.");
			pi=3.14;
		}
		*/

		if(p>=3.14 && p<=3.142) pi=p;
		else {
			System.out.println("�������� 3.14���� ������ ���̾�� �մϴ�. �⺻ �������� �� 3.14�� ��Ʈ�մϴ�.");
			pi=3.14;
		}
	}
	
	public double getPi()
	{
		return pi;
	}
	
	public double area()
	{
		return radius*radius*pi;
	}

	///*
	public static double area(double r)
	{
		return r*r*3.14;
	}
	//*/

	/*
	public static double area(double r, double p)
	{
		return r*r*p;
	}
	//*/
	
	public double circumference()
	{
		return 2.0*radius*pi;
	}

	//*
	public static double circumference(double r)
	{
		return 2.0*r*3.14;
	}
	//*/

	/*
	public static double circumference(double r, double p)
	{
		return 2.0*r*p;
	}
	//*/
}

class  Circle042Test
{
	public static void main(String[] args) 
	{
		/*
		Circle042 a=new Circle042();
		Circle042 b=new Circle042();
		Circle042 c=new Circle042();
		Circle042 d=new Circle042();
		Circle042 e=new Circle042();
		Circle042 f=new Circle042();
		//*/

		/*
		Circle042 a=Circle042.getInstance();
		Circle042 b=Circle042.getInstance();
		Circle042 c=Circle042.getInstance();
		Circle042 d=Circle042.getInstance();
		Circle042 e=Circle042.getInstance();
		Circle042 f=Circle042.getInstance();
		//*/
		
		
		/*
		Circle042 x[]=new Circle042[10];
		for(int i=0;i<x.length;i++) x[i]=new Circle042();
		//for(int i=0;i<x.length;i++) x[i]=Circle042.getInstance();
		for(int i=0;i<x.length;i++) System.out.println("���� ��Ʈ�� �������� "+x[i].getRadius()+", �������� "+x[i].getPi()+" �Դϴ�. ���� ���̴� "+x[i].area()+", �ѷ��� "+x[i].circumference()+" �Դϴ�.");
		//*/
	}
}