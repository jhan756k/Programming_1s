class Circle041
{
	private double radius;
	private double pi=3.14;
	
	private static int counter;

	/*
	public Circle041() {
		counter++;
		radius=counter*1.0;
	}
	//*/

	/*
	public Circle041() {
		counter++;
		if(counter%2==1) radius=1.0;
		else radius=100.0;
	}
	//*/

	/*
	public Circle041() {
		counter++;
		if(counter==5) 	{
			System.out.println("\n*********************************************");	
			System.out.println("���α׷����� ���� �� �Ͻô� ����!!!");
			System.out.println("���� ���α׷��Ӱ� �Ǽ���.");
			System.out.println("�׶��� \"��âȯ\" �� ����� �ּ���.");
			System.out.println("*********************************************\n");
			radius=1.0;
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

class  Circle041Test
{
	public static void main(String[] args) 
	{
		///*
		Circle041 a=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+a.getRadius()+", �������� "+a.getPi()+" �Դϴ�. ���� ���̴� "+a.area()+", �ѷ��� "+a.circumference()+" �Դϴ�.");

		Circle041 b=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+b.getRadius()+", �������� "+b.getPi()+" �Դϴ�. ���� ���̴� "+b.area()+", �ѷ��� "+b.circumference()+" �Դϴ�.");

		Circle041 c=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+c.getRadius()+", �������� "+c.getPi()+" �Դϴ�. ���� ���̴� "+c.area()+", �ѷ��� "+c.circumference()+" �Դϴ�.");

		Circle041 d=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+d.getRadius()+", �������� "+d.getPi()+" �Դϴ�. ���� ���̴� "+d.area()+", �ѷ��� "+d.circumference()+" �Դϴ�.");

		Circle041 e=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+e.getRadius()+", �������� "+e.getPi()+" �Դϴ�. ���� ���̴� "+e.area()+", �ѷ��� "+e.circumference()+" �Դϴ�.");

		Circle041 f=new Circle041();
		System.out.println("���� ��Ʈ�� �������� "+f.getRadius()+", �������� "+f.getPi()+" �Դϴ�. ���� ���̴� "+f.area()+", �ѷ��� "+f.circumference()+" �Դϴ�.");
		//*/
		
		/*
		Circle041 a[]=new Circle041[10];
		for(int i=0;i<a.length;i++) a[i]=new Circle041();
		for(int i=0;i<a.length;i++) System.out.println("���� ��Ʈ�� �������� "+a[i].getRadius()+", �������� "+a[i].getPi()+" �Դϴ�. ���� ���̴� "+a[i].area()+", �ѷ��� "+a[i].circumference()+" �Դϴ�.");
		//*/
	}
}